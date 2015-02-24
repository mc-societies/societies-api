package org.societies.api.setting;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.jetbrains.annotations.Nullable;
import org.societies.bridge.Location;
import org.societies.bridge.World;
import org.societies.bridge.WorldResolver;
import org.societies.groups.setting.Setting;
import org.societies.groups.setting.SettingException;
import org.societies.groups.setting.subject.Subject;
import org.societies.groups.setting.target.Target;

import java.io.*;

/**
 * Represents a LocationSetting
 */
public class LocationSetting extends Setting<Location> {
    public static final String ID = "location";

    private final WorldResolver worldResolver;
    private final World defaultWorld;
    private final int identity;

    @Inject
    public LocationSetting(WorldResolver worldResolver,
                           @Named("default-world") World defaultWorld,
                           @Named("server-identity") short identity) {
        this(ID, worldResolver, defaultWorld, identity);
    }

    public LocationSetting(String id, WorldResolver worldResolver,
                           World defaultWorld,
                           short identity) {
        super(id);
        this.worldResolver = worldResolver;
        this.defaultWorld = defaultWorld;
        this.identity = identity;
    }

    @Override
    public Location convert(Subject subject, Target target, byte[] value) throws SettingException {
        DataInputStream is = new DataInputStream(new ByteArrayInputStream(value));

        try {
            int identity = is.readShort();

            if (this.identity != identity) {
                return new Location.InvalidLocation();
            }

            World world = worldResolver.getWorld(is.readUTF());
            return new Location(world == null ? defaultWorld : world,
                    is.readDouble(), is.readDouble(), is.readDouble(), is.readFloat(), is.readFloat(), is.readFloat());
        } catch (IOException e) {
            throw new SettingException(e);
        }
    }

    @Override
    public byte[] convert(Subject subject, Target target, @Nullable Location value) throws SettingException {
        if (value == null) {
            return null;
        }

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        DataOutputStream os = new DataOutputStream(out);

        try {
            os.writeShort(identity);
            os.writeUTF(value.getWorld().getName());
            os.writeDouble(value.getX());
            os.writeDouble(value.getY());
            os.writeDouble(value.getZ());

            os.writeFloat(value.getYaw());
            os.writeFloat(value.getPitch());
            os.writeFloat(value.getRoll());
        } catch (IOException e) {
            throw new SettingException(e);
        }

        return out.toByteArray();
    }
}
