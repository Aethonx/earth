package io.shaded.earth.api.service;

import io.shaded.earth.api.world.EarthWorld;
import java.util.UUID;
import java.util.function.Consumer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.checkerframework.checker.nullness.qual.NonNull;

public interface EarthService {

  /**
   * @param world World to generate.
   * @return returns a new a world and registers it internally.
   */
  @NonNull EarthWorld newWorld(EarthWorld.@NonNull Builder world);

  /**
   * @param worldId the world that is being attempted to be loaded.
   * @return the resulting world if loaded.
   */
  @NonNull EarthWorld load(final @NonNull UUID worldId);

  /**
   * Sends all the players within the world being unloaded to the first world in
   * the server.
   *
   * @param worldId worldId  the world that is being attempted to be saved.
   * @return if the world was able to be saved.
   */
  default boolean unload(final @NonNull UUID worldId) {
    var world = Bukkit.getWorlds().get(0);
    if (world != null) {
      throw new IllegalStateException("Error while unloading world cannot "
          + "find world to fallback too.");
    }
    return this.unload(worldId,
        player -> player.teleportAsync(world.getSpawnLocation()));
  }

  /**
   * @param worldId  the world that is being attempted to be saved.
   * @param onUnload called before the load is unloaded so the players can be
   *                 transferred etc.
   * @return if the world was able to be saved.
   */
  boolean unload(final @NonNull UUID worldId,
      final @NonNull Consumer<Player> onUnload);
}
