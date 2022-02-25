package io.shaded.earth.plugin.service;

import java.io.File;
import java.nio.file.Path;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * Internal service that is used to manage the Minecraft world files.
 */
public interface EarthFileService {

  /**
   * Unzips a world from the database.
   *
   * @param compressed the bytearray of the zip file.
   * @param target     the target directory to unzip to.
   */
  void unzip(byte[] compressed, Path target);

  /**
   * @param file zips the directory at the file.
   * @return returns the bytearray if the directory was successfully compressed.
   */
  byte[] zip(final @NonNull File file);

  /**
   * @param file directory to remove
   * @return True if the directory was successfully deleted. False if not.
   */
  boolean delete(final @NonNull File file);
}
