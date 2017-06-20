// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.battlelancer.seriesguide.util;

import com.uwetrottmann.thetvdb.TheTvdb;
import com.uwetrottmann.trakt5.TraktV2;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import javax.inject.Provider;

public final class AllApisAuthenticator_MembersInjector
    implements MembersInjector<AllApisAuthenticator> {
  private final Provider<TheTvdb> theTvdbProvider;

  private final Provider<TraktV2> traktProvider;

  public AllApisAuthenticator_MembersInjector(
      Provider<TheTvdb> theTvdbProvider, Provider<TraktV2> traktProvider) {
    assert theTvdbProvider != null;
    this.theTvdbProvider = theTvdbProvider;
    assert traktProvider != null;
    this.traktProvider = traktProvider;
  }

  public static MembersInjector<AllApisAuthenticator> create(
      Provider<TheTvdb> theTvdbProvider, Provider<TraktV2> traktProvider) {
    return new AllApisAuthenticator_MembersInjector(theTvdbProvider, traktProvider);
  }

  @Override
  public void injectMembers(AllApisAuthenticator instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.theTvdb = DoubleCheck.lazy(theTvdbProvider);
    instance.trakt = DoubleCheck.lazy(traktProvider);
  }

  public static void injectTheTvdb(
      AllApisAuthenticator instance, Provider<TheTvdb> theTvdbProvider) {
    instance.theTvdb = DoubleCheck.lazy(theTvdbProvider);
  }

  public static void injectTrakt(AllApisAuthenticator instance, Provider<TraktV2> traktProvider) {
    instance.trakt = DoubleCheck.lazy(traktProvider);
  }
}