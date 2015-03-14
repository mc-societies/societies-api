package org.societies.api;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Represents a Saveguard
 */
public interface Saveguard {

    void backup(File file) throws IOException;

    void backup(OutputStream outputStream) throws IOException;
}
