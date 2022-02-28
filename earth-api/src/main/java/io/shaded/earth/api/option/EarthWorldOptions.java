package io.shaded.earth.api.option;

import org.bukkit.GameMode;
import org.bukkit.generator.ChunkGenerator;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * Defines configurable options that are applied to the specific world.
 */
public interface EarthWorldOptions {

  /**
   * @return creates a new builder for the world.
   */
  static EarthWorldOptions.@NonNull Builder builder() {
    return new EarthWorldOptionsImpl.BuilderImpl();
  }

  /**
   * Used when a player teleports to the Earth if the player is not an operator
   * their gamemode will be set to this value.
   */
  @NonNull Option<GameMode> GAMEMODE = Option.valueOf("gamemode", GameMode.SURVIVAL);

  /**
   * Option if players data should or shouldn't be saved. Should primarily be
   * used for hubs and other non inventory dependent gamemodes.
   */
  @NonNull Option<Boolean> SAVE_PLAYER_DATA = Option.valueOf("save_player_data", Boolean.TRUE);

  /**
   * Option if entities should be saved in the world or removed.
   */
  @NonNull Option<Boolean> SAVE_ENTITIES = Option.valueOf("save_entities", Boolean.TRUE);

  /**
   * The chunk generator that the world will generate from.
   */
  @NonNull Option<ChunkGenerator> CHUNK_GENERATOR = Option.valueOf("chunk_generator");

  interface Builder {

    /**
     * @return builds the options for the world.
     */
    @NonNull EarthWorldOptions build();

    /**
     * Allows for configuration of the worlds options.
     *
     * @param option Option that is being applied to the world.
     * @param value  the value of the option of type T.
     * @param <T>    type of the option
     * @return the builder instance to configure more options
     */
    @NonNull <T> Builder option(
        final @NonNull Option<T> option,
        final @NonNull T value);
  }
}
