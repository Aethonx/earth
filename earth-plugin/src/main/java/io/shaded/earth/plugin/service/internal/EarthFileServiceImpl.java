package io.shaded.earth.plugin.service.internal;

import com.google.inject.Singleton;
import io.shaded.earth.plugin.service.EarthFileService;
import java.io.File;
import java.nio.file.Path;
import org.checkerframework.checker.nullness.qual.NonNull;

@Singleton
public final class EarthFileServiceImpl implements EarthFileService {

  @Override
  public void unzip(byte[] compressed, Path target) {

  }

  @Override
  public byte[] zip(
      @NonNull File file) {
    return new byte[0];
  }

  @Override
  public boolean delete(
      @NonNull File file) {
    return false;
  }
}
