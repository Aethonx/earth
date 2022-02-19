package io.shaded.earth.api.exception;

import org.checkerframework.checker.nullness.qual.NonNull;

public class EarthLoadException extends EarthException {

  public EarthLoadException(final @NonNull String message) {
    super(message);
  }
}
