// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.battlelancer.seriesguide.thetvdbapi;

import com.uwetrottmann.thetvdb.TheTvdb;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import javax.inject.Provider;

public final class SgTheTvdbInterceptor_MembersInjector
    implements MembersInjector<SgTheTvdbInterceptor> {
  private final Provider<TheTvdb> theTvdbProvider;

  public SgTheTvdbInterceptor_MembersInjector(Provider<TheTvdb> theTvdbProvider) {
    assert theTvdbProvider != null;
    this.theTvdbProvider = theTvdbProvider;
  }

  public static MembersInjector<SgTheTvdbInterceptor> create(Provider<TheTvdb> theTvdbProvider) {
    return new SgTheTvdbInterceptor_MembersInjector(theTvdbProvider);
  }

  @Override
  public void injectMembers(SgTheTvdbInterceptor instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.theTvdb = DoubleCheck.lazy(theTvdbProvider);
  }

  public static void injectTheTvdb(
      SgTheTvdbInterceptor instance, Provider<TheTvdb> theTvdbProvider) {
    instance.theTvdb = DoubleCheck.lazy(theTvdbProvider);
  }
}
