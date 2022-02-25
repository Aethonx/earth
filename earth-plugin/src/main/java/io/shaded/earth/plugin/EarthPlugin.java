package io.shaded.earth.plugin;

import com.google.inject.Guice;
import com.google.inject.Injector;
import io.shaded.earth.plugin.inject.EarthModule;
import org.bukkit.plugin.java.JavaPlugin;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;

public final class EarthPlugin extends JavaPlugin {
  private @MonotonicNonNull Injector injector;

  @Override
  public void onEnable() {
    this.injector = Guice.createInjector(new EarthModule());
  }
}
