package io.shaded.earth.api;

import org.checkerframework.checker.nullness.qual.NonNull;

final class Assert {

  private Assert() {
  }

  /**
   * Checks that the input {@link String} only contains characters and throws
   * {@link IllegalArgumentException} with message if it has other characters.
   *
   * @param input   the {@link String} to check to see if its full of non alpha
   *                characters.
   * @param message the message to attach to the {@link IllegalArgumentException}.
   * @return the input if valid.
   */
  static @NonNull String requireAlpha(final @NonNull String input,
      final @NonNull String message) {

    // Checks the input  to see if the input is all characters.
    // Taken from https://stackoverflow.com/a/29836318
    if (!input.chars().allMatch(Character::isLetter)) {
      throw new IllegalArgumentException(message);
    }

    return input;
  }

  /**
   * Checks that the input {@link String} is non-empty and throws {@link
   * IllegalArgumentException} with a message if it's empty.
   *
   * @param input   the {@link String} to check to see if it's empty.
   * @param message the message to attach to the {@link IllegalArgumentException}.
   * @return the input if valid.
   */
  static @NonNull String requireNonEmpty(final @NonNull String input,
      final @NonNull String message) {

    if (input.isEmpty()) {
      throw new IllegalArgumentException(message);
    }

    return input;
  }
}
