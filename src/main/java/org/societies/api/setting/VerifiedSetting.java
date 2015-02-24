package org.societies.api.setting;

import org.societies.groups.setting.BooleanSetting;

/**
 * Represents a VerifySetting
 */
public class VerifiedSetting extends BooleanSetting {

    public static final String ID = "verify";

    public VerifiedSetting() {
        super(ID);
    }
}
