// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.battlelancer.seriesguide.modules;

import com.uwetrottmann.trakt5.TraktV2;
import com.uwetrottmann.trakt5.services.Users;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class TraktModule_ProvideUsersFactory implements Factory<Users> {
  private final TraktModule module;

  private final Provider<TraktV2> traktProvider;

  public TraktModule_ProvideUsersFactory(TraktModule module, Provider<TraktV2> traktProvider) {
    assert module != null;
    this.module = module;
    assert traktProvider != null;
    this.traktProvider = traktProvider;
  }

  @Override
  public Users get() {
    return Preconditions.checkNotNull(
        module.provideUsers(traktProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Users> create(TraktModule module, Provider<TraktV2> traktProvider) {
    return new TraktModule_ProvideUsersFactory(module, traktProvider);
  }

  /** Proxies {@link TraktModule#provideUsers(TraktV2)}. */
  public static Users proxyProvideUsers(TraktModule instance, TraktV2 trakt) {
    return instance.provideUsers(trakt);
  }
}
