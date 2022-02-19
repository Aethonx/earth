package io.shaded.earth.api.exception;

public abstract class EarthException extends RuntimeException {
  public EarthException(String message){
    super(message);
  }
}
