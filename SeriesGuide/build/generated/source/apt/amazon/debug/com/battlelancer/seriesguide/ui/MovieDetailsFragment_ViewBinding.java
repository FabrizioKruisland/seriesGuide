// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MovieDetailsFragment_ViewBinding implements Unbinder {
  private MovieDetailsFragment target;

  @UiThread
  public MovieDetailsFragment_ViewBinding(MovieDetailsFragment target, View source) {
    this.target = target;

    target.rootLayoutMovie = Utils.findRequiredViewAsType(source, R.id.rootLayoutMovie, "field 'rootLayoutMovie'", FrameLayout.class);
    target.progressBar = Utils.findRequiredView(source, R.id.progressBar, "field 'progressBar'");
    target.containerMovieButtons = Utils.findRequiredView(source, R.id.containerMovieButtons, "field 'containerMovieButtons'");
    target.dividerMovieButtons = Utils.findRequiredView(source, R.id.dividerMovieButtons, "field 'dividerMovieButtons'");
    target.buttonMovieCheckIn = Utils.findRequiredViewAsType(source, R.id.buttonMovieCheckIn, "field 'buttonMovieCheckIn'", Button.class);
    target.buttonMovieWatched = Utils.findRequiredViewAsType(source, R.id.buttonMovieWatched, "field 'buttonMovieWatched'", Button.class);
    target.buttonMovieCollected = Utils.findRequiredViewAsType(source, R.id.buttonMovieCollected, "field 'buttonMovieCollected'", Button.class);
    target.buttonMovieWatchlisted = Utils.findRequiredViewAsType(source, R.id.buttonMovieWatchlisted, "field 'buttonMovieWatchlisted'", Button.class);
    target.containerRatings = Utils.findRequiredView(source, R.id.containerRatings, "field 'containerRatings'");
    target.textViewRatingsTmdbValue = Utils.findRequiredViewAsType(source, R.id.textViewRatingsTmdbValue, "field 'textViewRatingsTmdbValue'", TextView.class);
    target.textViewRatingsTmdbVotes = Utils.findRequiredViewAsType(source, R.id.textViewRatingsTmdbVotes, "field 'textViewRatingsTmdbVotes'", TextView.class);
    target.textViewRatingsTraktVotes = Utils.findRequiredViewAsType(source, R.id.textViewRatingsTraktVotes, "field 'textViewRatingsTraktVotes'", TextView.class);
    target.textViewRatingsTraktValue = Utils.findRequiredViewAsType(source, R.id.textViewRatingsTraktValue, "field 'textViewRatingsTraktValue'", TextView.class);
    target.textViewRatingsTraktUserLabel = Utils.findRequiredViewAsType(source, R.id.textViewRatingsTraktUserLabel, "field 'textViewRatingsTraktUserLabel'", TextView.class);
    target.textViewRatingsTraktUser = Utils.findRequiredViewAsType(source, R.id.textViewRatingsTraktUser, "field 'textViewRatingsTraktUser'", TextView.class);
    target.contentContainerMovie = Utils.findRequiredViewAsType(source, R.id.contentContainerMovie, "field 'contentContainerMovie'", NestedScrollView.class);
    target.contentContainerMovieRight = Utils.findOptionalViewAsType(source, R.id.contentContainerMovieRight, "field 'contentContainerMovieRight'", NestedScrollView.class);
    target.frameLayoutMoviePoster = Utils.findRequiredViewAsType(source, R.id.frameLayoutMoviePoster, "field 'frameLayoutMoviePoster'", FrameLayout.class);
    target.imageViewMoviePoster = Utils.findRequiredViewAsType(source, R.id.imageViewMoviePoster, "field 'imageViewMoviePoster'", ImageView.class);
    target.textViewMovieTitle = Utils.findRequiredViewAsType(source, R.id.textViewMovieTitle, "field 'textViewMovieTitle'", TextView.class);
    target.textViewMovieDescription = Utils.findRequiredViewAsType(source, R.id.textViewMovieDescription, "field 'textViewMovieDescription'", TextView.class);
    target.textViewMovieDate = Utils.findRequiredViewAsType(source, R.id.textViewMovieDate, "field 'textViewMovieDate'", TextView.class);
    target.textViewMovieGenresLabel = Utils.findRequiredView(source, R.id.textViewMovieGenresLabel, "field 'textViewMovieGenresLabel'");
    target.textViewMovieGenres = Utils.findRequiredViewAsType(source, R.id.textViewMovieGenres, "field 'textViewMovieGenres'", TextView.class);
    target.containerCast = Utils.findRequiredViewAsType(source, R.id.containerCast, "field 'containerCast'", ViewGroup.class);
    target.labelCast = Utils.findRequiredView(source, R.id.labelCast, "field 'labelCast'");
    target.containerCrew = Utils.findRequiredViewAsType(source, R.id.containerCrew, "field 'containerCrew'", ViewGroup.class);
    target.labelCrew = Utils.findRequiredView(source, R.id.labelCrew, "field 'labelCrew'");
    target.buttonMovieLanguage = Utils.findRequiredViewAsType(source, R.id.buttonMovieLanguage, "field 'buttonMovieLanguage'", Button.class);
    target.buttonMovieComments = Utils.findRequiredViewAsType(source, R.id.buttonMovieComments, "field 'buttonMovieComments'", Button.class);
    target.containerMovieActions = Utils.findRequiredViewAsType(source, R.id.containerMovieActions, "field 'containerMovieActions'", ViewGroup.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MovieDetailsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rootLayoutMovie = null;
    target.progressBar = null;
    target.containerMovieButtons = null;
    target.dividerMovieButtons = null;
    target.buttonMovieCheckIn = null;
    target.buttonMovieWatched = null;
    target.buttonMovieCollected = null;
    target.buttonMovieWatchlisted = null;
    target.containerRatings = null;
    target.textViewRatingsTmdbValue = null;
    target.textViewRatingsTmdbVotes = null;
    target.textViewRatingsTraktVotes = null;
    target.textViewRatingsTraktValue = null;
    target.textViewRatingsTraktUserLabel = null;
    target.textViewRatingsTraktUser = null;
    target.contentContainerMovie = null;
    target.contentContainerMovieRight = null;
    target.frameLayoutMoviePoster = null;
    target.imageViewMoviePoster = null;
    target.textViewMovieTitle = null;
    target.textViewMovieDescription = null;
    target.textViewMovieDate = null;
    target.textViewMovieGenresLabel = null;
    target.textViewMovieGenres = null;
    target.containerCast = null;
    target.labelCast = null;
    target.containerCrew = null;
    target.labelCrew = null;
    target.buttonMovieLanguage = null;
    target.buttonMovieComments = null;
    target.containerMovieActions = null;
  }
}
