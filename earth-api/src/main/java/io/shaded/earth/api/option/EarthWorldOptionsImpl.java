package io.shaded.earth.api.option;

import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Optional;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * Defines configurable options that are applied to the specific world.
 */
final class EarthWorldOptionsImpl implements EarthWorldOptions {

  private final @NonNull ImmutableMap<Option<?>, Object> options;

  EarthWorldOptionsImpl(
      final @NonNull ImmutableMap<Option<?>, Object> options) {
    this.options = options;
  }

  @Override
  public @NonNull <T> Optional<T> findOption(
      @NonNull Option<T> option) {
    var type = this.options.get(option);

    if (type == null) {
      return option.defaultValue();
    }

    return Optional.of(option.cast(type));
  }

  @Override
  public @NonNull ImmutableMap<Option<?>, Object> options() {
    return this.options;
  }

  static final class BuilderImpl implements EarthWorldOptions.Builder {

    private final HashMap<Option<?>, Object> optionMap = new HashMap<>();

    BuilderImpl(@NonNull EarthWorldOptions options) {
      this.optionMap.putAll(options.options());
    }

    BuilderImpl() {
    }

    @Override
    public @NonNull EarthWorldOptionsImpl build() {
      return new EarthWorldOptionsImpl(
          ImmutableMap.<Option<?>, Object>builder()
              .putAll(this.optionMap)
              .build()
      );
    }

    @Override
    public <T> @NonNull Builder option(final @NonNull Option<T> option,
        final @NonNull T value) {
      this.optionMap.put(option, value);
      return this;
    }
  }

}
