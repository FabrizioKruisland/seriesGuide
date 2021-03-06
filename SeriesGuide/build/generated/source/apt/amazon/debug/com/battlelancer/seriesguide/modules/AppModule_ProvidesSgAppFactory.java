// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.battlelancer.seriesguide.modules;

import com.battlelancer.seriesguide.SgApp;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class AppModule_ProvidesSgAppFactory implements Factory<SgApp> {
  private final AppModule module;

  public AppModule_ProvidesSgAppFactory(AppModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public SgApp get() {
    return Preconditions.checkNotNull(
        module.providesSgApp(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<SgApp> create(AppModule module) {
    return new AppModule_ProvidesSgAppFactory(module);
  }

  /** Proxies {@link AppModule#providesSgApp()}. */
  public static SgApp proxyProvidesSgApp(AppModule instance) {
    return instance.providesSgApp();
  }
}
