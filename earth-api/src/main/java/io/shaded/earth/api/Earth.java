package io.shaded.earth.api;

import com.google.inject.Inject;
import com.google.inject.Injector;
import io.shaded.earth.api.service.EarthService;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * Provides static access into the core functions of Earth.
 */
public final class Earth {

  @Inject
  private static @MonotonicNonNull Injector injector;

  private Earth() {
  }

  /**
   * @return Earth service that allows for control of Earth Worlds.
   */
  public static @NonNull EarthService earthService() {
    if (injector == null) {
      throw new IllegalStateException("Earth has not been initialized yet.");
    }
    return injector.getInstance(EarthService.class);
  }

}
