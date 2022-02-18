package io.shaded.earth.api;

import java.util.UUID;
import org.checkerframework.checker.nullness.qual.NonNull;

public interface EarthWorld {

  /**
   * @return Crates a new instance of a earth world builder.
   */
  static EarthWorld.@NonNull Builder builder() {
    return new EarthWorldImpl.BuilderImpl();
  }

  /**
   * The world is that is bound to the {@link EarthNamespace} via the format of
   * 'namespace:id'.
   *
   * @return id generated when the world is crated.
   */
  @NonNull UUID id();

  /**
   * @return namespace bound to the world.
   */
  @NonNull EarthNamespace namespace();

  /**
   * @return the combined id building the 'namespace:id'.
   */
  @NonNull String combinedId();

  /**
   * @return A template world is used as a base world where it cannot be saved
   * to the database if modified.
   */
  boolean template();

  interface Builder {

    /**
     * @param namespace
     */
    @NonNull Builder namespace(final @NonNull EarthNamespace namespace);

    @NonNull Builder template(final boolean template);
  }
}
