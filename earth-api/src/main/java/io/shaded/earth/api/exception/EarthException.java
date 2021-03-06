package io.shaded.earth.api.exception;

import org.checkerframework.checker.nullness.qual.NonNull;

public abstract class EarthException extends RuntimeException {
  public EarthException(final @NonNull String message){
    super(message);
  }
}
