package io.shaded.earth.plugin.inject;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import io.shaded.earth.api.Earth;
import io.shaded.earth.api.service.EarthService;
import io.shaded.earth.plugin.compress.EarthCompressor;
import io.shaded.earth.plugin.service.EarthFileService;
import io.shaded.earth.plugin.service.internal.EarthFileServiceImpl;
import io.shaded.earth.plugin.service.internal.EarthServiceImpl;

public class EarthModule extends AbstractModule {

  /**
   * Configures bindings of Guice.
   */
  @Override
  protected void configure() {
    this.requestStaticInjection(Earth.class);

    this.bind(EarthService.class).to(EarthServiceImpl.class);
    this.bind(EarthFileService.class).to(EarthFileServiceImpl.class);
  }

  /**
   * Default compressor is Zstandard. With later releases other compression
   * algorithms will be added.
   *
   * @return The implementation of the compressor that is used.
   */
  @Provides
  @Singleton
  public EarthCompressor compressor() {
    return EarthCompressor.create(EarthCompressor.Z_STANDARD_COMPRESS_TYPE);
  }
}
