package io.shaded.earth.api.option;

import java.util.HashMap;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * Defines configurable options that are applied to the specific world.
 */
final class EarthWorldOptionsImpl implements EarthWorldOptions {

  private final @NonNull HashMap<Option<?>, Object> options;

  private EarthWorldOptionsImpl(
      final @NonNull HashMap<Option<?>, Object> options) {
    this.options = options;
  }

  static final class BuilderImpl implements EarthWorldOptions.Builder {

    private final HashMap<Option<?>, Object> optionMap = new HashMap<>();

    BuilderImpl() {
    }

    @Override
    public @NonNull EarthWorldOptionsImpl build() {
      return new EarthWorldOptionsImpl(this.optionMap);
    }

    @Override
    public <T> @NonNull Builder option(final @NonNull Option<T> option,
        final @NonNull T value) {
      this.optionMap.put(option, value);
      return this;
    }
  }

}
