package io.shaded.earth.plugin.service.internal;

import com.google.inject.Singleton;
import io.shaded.earth.api.service.EarthService;
import io.shaded.earth.api.world.EarthWorld;
import java.util.UUID;
import java.util.function.Consumer;
import org.bukkit.entity.Player;
import org.checkerframework.checker.nullness.qual.NonNull;


/**
 * Internal implementation of {@link EarthService}
 */
@Singleton
public final class EarthServiceImpl implements EarthService {

  @Override
  public @NonNull EarthWorld newWorld(
      EarthWorld.@NonNull Builder world) {
    return null;
  }

  @Override
  public @NonNull EarthWorld load(@NonNull UUID worldId) {
    return null;
  }

  @Override
  public boolean unload(
      @NonNull UUID worldId,
      @NonNull Consumer<Player> onUnload) {
    return false;
  }
}
