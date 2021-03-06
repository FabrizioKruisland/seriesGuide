// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.battlelancer.seriesguide.loaders;

import com.uwetrottmann.tmdb2.services.MoviesService;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class MovieCreditsLoader_MembersInjector
    implements MembersInjector<MovieCreditsLoader> {
  private final Provider<MoviesService> moviesServiceProvider;

  public MovieCreditsLoader_MembersInjector(Provider<MoviesService> moviesServiceProvider) {
    assert moviesServiceProvider != null;
    this.moviesServiceProvider = moviesServiceProvider;
  }

  public static MembersInjector<MovieCreditsLoader> create(
      Provider<MoviesService> moviesServiceProvider) {
    return new MovieCreditsLoader_MembersInjector(moviesServiceProvider);
  }

  @Override
  public void injectMembers(MovieCreditsLoader instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.moviesService = moviesServiceProvider.get();
  }

  public static void injectMoviesService(
      MovieCreditsLoader instance, Provider<MoviesService> moviesServiceProvider) {
    instance.moviesService = moviesServiceProvider.get();
  }
}
