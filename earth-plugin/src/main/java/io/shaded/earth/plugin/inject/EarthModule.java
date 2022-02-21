package io.shaded.earth.plugin.inject;

import com.google.inject.AbstractModule;
import io.shaded.earth.api.Earth;

public class EarthModule extends AbstractModule {

  @Override
  protected void configure() {
    this.requestStaticInjection(Earth.class);
  }
}
