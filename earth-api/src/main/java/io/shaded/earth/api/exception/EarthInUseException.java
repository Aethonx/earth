package io.shaded.earth.api.exception;

import org.checkerframework.checker.nullness.qual.NonNull;

public class EarthInUseException extends EarthException {

  public EarthInUseException(final @NonNull String message) {
    super(message);
  }
}
