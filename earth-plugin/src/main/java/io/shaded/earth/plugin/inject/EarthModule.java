package io.shaded.earth.plugin.inject;

import com.google.inject.AbstractModule;
import io.shaded.earth.api.Earth;
import io.shaded.earth.api.service.EarthService;
import io.shaded.earth.plugin.service.EarthFileService;
import io.shaded.earth.plugin.service.internal.EarthFileServiceImpl;
import io.shaded.earth.plugin.service.internal.EarthServiceImpl;

public class EarthModule extends AbstractModule {

  @Override
  protected void configure() {
    this.requestStaticInjection(Earth.class);

    this.bind(EarthService.class).to(EarthServiceImpl.class);
    this.bind(EarthFileService.class).to(EarthFileServiceImpl.class);
  }
}
