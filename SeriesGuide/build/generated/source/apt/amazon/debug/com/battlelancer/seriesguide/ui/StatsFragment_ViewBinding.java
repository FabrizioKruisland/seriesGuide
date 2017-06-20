// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import com.battlelancer.seriesguide.widgets.EmptyView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class StatsFragment_ViewBinding implements Unbinder {
  private StatsFragment target;

  @UiThread
  public StatsFragment_ViewBinding(StatsFragment target, View source) {
    this.target = target;

    target.errorView = Utils.findRequiredViewAsType(source, R.id.emptyViewStats, "field 'errorView'", EmptyView.class);
    target.mShowCount = Utils.findRequiredViewAsType(source, R.id.textViewStatsShows, "field 'mShowCount'", TextView.class);
    target.mShowsWithNextEpisode = Utils.findRequiredViewAsType(source, R.id.textViewStatsShowsWithNext, "field 'mShowsWithNextEpisode'", TextView.class);
    target.mProgressShowsWithNextEpisode = Utils.findRequiredViewAsType(source, R.id.progressBarStatsShowsWithNext, "field 'mProgressShowsWithNextEpisode'", ProgressBar.class);
    target.mShowsContinuing = Utils.findRequiredViewAsType(source, R.id.textViewStatsShowsContinuing, "field 'mShowsContinuing'", TextView.class);
    target.mProgressShowsContinuing = Utils.findRequiredViewAsType(source, R.id.progressBarStatsShowsContinuing, "field 'mProgressShowsContinuing'", ProgressBar.class);
    target.mEpisodeCount = Utils.findRequiredViewAsType(source, R.id.textViewStatsEpisodes, "field 'mEpisodeCount'", TextView.class);
    target.mEpisodesWatched = Utils.findRequiredViewAsType(source, R.id.textViewStatsEpisodesWatched, "field 'mEpisodesWatched'", TextView.class);
    target.mProgressEpisodesWatched = Utils.findRequiredViewAsType(source, R.id.progressBarStatsEpisodesWatched, "field 'mProgressEpisodesWatched'", ProgressBar.class);
    target.mEpisodesRuntime = Utils.findRequiredViewAsType(source, R.id.textViewStatsEpisodesRuntime, "field 'mEpisodesRuntime'", TextView.class);
    target.mProgressEpisodesRuntime = Utils.findRequiredViewAsType(source, R.id.progressBarStatsEpisodesRuntime, "field 'mProgressEpisodesRuntime'", ProgressBar.class);
    target.mMovieCount = Utils.findRequiredViewAsType(source, R.id.textViewStatsMovies, "field 'mMovieCount'", TextView.class);
    target.mMoviesWatchlist = Utils.findRequiredViewAsType(source, R.id.textViewStatsMoviesWatchlist, "field 'mMoviesWatchlist'", TextView.class);
    target.mProgressMoviesWatchlist = Utils.findRequiredViewAsType(source, R.id.progressBarStatsMoviesWatchlist, "field 'mProgressMoviesWatchlist'", ProgressBar.class);
    target.mMoviesWatchlistRuntime = Utils.findRequiredViewAsType(source, R.id.textViewStatsMoviesWatchlistRuntime, "field 'mMoviesWatchlistRuntime'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    StatsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.errorView = null;
    target.mShowCount = null;
    target.mShowsWithNextEpisode = null;
    target.mProgressShowsWithNextEpisode = null;
    target.mShowsContinuing = null;
    target.mProgressShowsContinuing = null;
    target.mEpisodeCount = null;
    target.mEpisodesWatched = null;
    target.mProgressEpisodesWatched = null;
    target.mEpisodesRuntime = null;
    target.mProgressEpisodesRuntime = null;
    target.mMovieCount = null;
    target.mMoviesWatchlist = null;
    target.mProgressMoviesWatchlist = null;
    target.mMoviesWatchlistRuntime = null;
  }
}
