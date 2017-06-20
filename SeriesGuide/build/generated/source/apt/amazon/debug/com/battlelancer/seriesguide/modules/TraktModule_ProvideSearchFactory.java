// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.battlelancer.seriesguide.modules;

import com.uwetrottmann.trakt5.TraktV2;
import com.uwetrottmann.trakt5.services.Search;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class TraktModule_ProvideSearchFactory implements Factory<Search> {
  private final TraktModule module;

  private final Provider<TraktV2> traktProvider;

  public TraktModule_ProvideSearchFactory(TraktModule module, Provider<TraktV2> traktProvider) {
    assert module != null;
    this.module = module;
    assert traktProvider != null;
    this.traktProvider = traktProvider;
  }

  @Override
  public Search get() {
    return Preconditions.checkNotNull(
        module.provideSearch(traktProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Search> create(TraktModule module, Provider<TraktV2> traktProvider) {
    return new TraktModule_ProvideSearchFactory(module, traktProvider);
  }

  /** Proxies {@link TraktModule#provideSearch(TraktV2)}. */
  public static Search proxyProvideSearch(TraktModule instance, TraktV2 trakt) {
    return instance.provideSearch(trakt);
  }
}