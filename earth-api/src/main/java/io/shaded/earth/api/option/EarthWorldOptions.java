package io.shaded.earth.api.option;

import org.bukkit.GameMode;
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

  interface Builder {

    /**
     * @return builds the options for the world.
     */
    @NonNull EarthWorldOptions build();

    @NonNull <T> Builder option(
        final @NonNull Option<T> option,
        final @NonNull T value);
  }
}
