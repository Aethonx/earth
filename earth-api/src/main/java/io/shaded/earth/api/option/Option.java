package io.shaded.earth.api.option;

import java.util.Optional;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class Option<T> {

  /**
   * @param name the name of the option
   * @param <T>  type of the option
   * @return a new option
   */
  public static <T> @NonNull Option<T> valueOf(final @NonNull String name) {
    return new Option<>(name, null);
  }

  /**
   * @param name         the name of the option
   * @param defaultValue the default value of the option.
   * @param <T>          type of the option
   * @return a new option
   */
  public static <T> @NonNull Option<T> valueOf(final @NonNull String name,
      final @NonNull T defaultValue) {
    return new Option<>(name, defaultValue);
  }

  private final @NonNull String name;
  private final @Nullable T defaultValue;

  private Option(
      @NonNull String name,
      @Nullable T defaultValue) {
    this.name = name;
    this.defaultValue = defaultValue;
  }

  /**
   * @return the name associated to this option.
   */
  public @NonNull String name() {
    return this.name;
  }

  /**
   * @return the default value if defined.
   */
  public @NonNull Optional<@Nullable T> defaultValue() {
    return Optional.ofNullable(this.defaultValue);
  }

  /**
   * @param object object to be cast to.
   * @return the object cast.
   */
  public @NonNull T cast(@NonNull Object object) {
    return (T) object;
  }
}
