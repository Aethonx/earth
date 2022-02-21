package io.shaded.earth.api.world;

import io.shaded.earth.api.namespace.EarthNamespace;
import java.util.UUID;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;
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
     * @return a new earth world instance.
     */
    @NonNull EarthWorld build();

    /**
     * @param namespace namespace that is attached to the world or the default
     *                  {@link EarthNamespace#DEFAULT_NAMESPACE}.
     */
    @NonNull Builder namespace(final @NonNull EarthNamespace namespace);

    /**
     * @param template template world is used as a base world where it cannot be
     *                 saved to the database if modified.
     */
    @NonNull Builder template(final boolean template);

    /**
     * @param world the world to copy from.
     */
    @NonNull Builder fromWorld(final @NonNull World world);

    /**
     * @param world the world to copy from.
     */
    @NonNull Builder fromWorld(final @NonNull EarthWorld world);

    /**
     * @param earthId the world to copy from.
     */
    @NonNull Builder fromWorld(final @NonNull UUID earthId);

    /**
     * @param chunkGenerator the custom generator that is to be used if world is
     *                       not being inherited form. If empty default
     *                       Minecraft generation will be used.
     */
    @NonNull Builder generator(final @NonNull ChunkGenerator chunkGenerator);
  }
}
