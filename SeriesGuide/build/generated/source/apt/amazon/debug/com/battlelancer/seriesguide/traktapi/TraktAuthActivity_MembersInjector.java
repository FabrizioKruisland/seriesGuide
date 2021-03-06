// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.battlelancer.seriesguide.traktapi;

import com.uwetrottmann.trakt5.TraktV2;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import javax.inject.Provider;

public final class TraktAuthActivity_MembersInjector implements MembersInjector<TraktAuthActivity> {
  private final Provider<TraktV2> traktProvider;

  public TraktAuthActivity_MembersInjector(Provider<TraktV2> traktProvider) {
    assert traktProvider != null;
    this.traktProvider = traktProvider;
  }

  public static MembersInjector<TraktAuthActivity> create(Provider<TraktV2> traktProvider) {
    return new TraktAuthActivity_MembersInjector(traktProvider);
  }

  @Override
  public void injectMembers(TraktAuthActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.trakt = DoubleCheck.lazy(traktProvider);
  }

  public static void injectTrakt(TraktAuthActivity instance, Provider<TraktV2> traktProvider) {
    instance.trakt = DoubleCheck.lazy(traktProvider);
  }
}
