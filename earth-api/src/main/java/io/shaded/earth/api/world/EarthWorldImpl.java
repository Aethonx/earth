package io.shaded.earth.api.world;

import io.shaded.earth.api.namespace.EarthNamespace;
import java.util.UUID;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

/*package-private*/ final class EarthWorldImpl implements EarthWorld {

  private final @NonNull UUID id;
  private final @NonNull EarthNamespace namespace;
  private final boolean template;

  EarthWorldImpl(
      @Nullable UUID id,
      @Nullable EarthNamespace namespace, boolean template) {
    this.id = id;
    this.namespace = namespace;
    this.template = template;
  }

  @Override
  public @NonNull UUID id() {
    return this.id;
  }

  @Override
  public @NonNull EarthNamespace namespace() {
    return this.namespace;
  }

  @Override
  public @NonNull String combinedId() {
    return this.namespace
        .namespace()
        .concat(":")
        .concat(this.id.toString());
  }

  @Override
  public boolean template() {
    return this.template;
  }

  static class BuilderImpl implements EarthWorld.Builder {

    @Override
    public @NonNull EarthWorld build() {
      return null;
    }

    @Override
    public @NonNull Builder namespace(
        @NonNull EarthNamespace namespace) {
      return null;
    }

    @Override
    public @NonNull Builder template(boolean template) {
      return null;
    }

    @Override
    public @NonNull Builder fromWorld(
        @NonNull World world) {
      return null;
    }

    @Override
    public @NonNull Builder fromWorld(
        @NonNull EarthWorld world) {
      return null;
    }

    @Override
    public @NonNull Builder fromWorld(
        @NonNull UUID earthId) {
      return null;
    }

    @Override
    public @NonNull Builder generator(
        @NonNull ChunkGenerator chunkGenerator) {
      return null;
    }
  }
}
