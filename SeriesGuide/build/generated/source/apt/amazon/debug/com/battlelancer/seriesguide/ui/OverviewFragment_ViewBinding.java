// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import com.battlelancer.seriesguide.widgets.FeedbackView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class OverviewFragment_ViewBinding implements Unbinder {
  private OverviewFragment target;

  @UiThread
  public OverviewFragment_ViewBinding(OverviewFragment target, View source) {
    this.target = target;

    target.containerShow = Utils.findRequiredView(source, R.id.containerOverviewShow, "field 'containerShow'");
    target.feedbackViewStub = Utils.findOptionalViewAsType(source, R.id.viewStubOverviewFeedback, "field 'feedbackViewStub'", ViewStub.class);
    target.feedbackView = Utils.findOptionalViewAsType(source, R.id.feedbackViewOverview, "field 'feedbackView'", FeedbackView.class);
    target.buttonFavorite = Utils.findRequiredViewAsType(source, R.id.imageButtonFavorite, "field 'buttonFavorite'", ImageButton.class);
    target.containerEpisode = Utils.findRequiredView(source, R.id.containerOverviewEpisode, "field 'containerEpisode'");
    target.containerActions = Utils.findRequiredViewAsType(source, R.id.containerEpisodeActions, "field 'containerActions'", LinearLayout.class);
    target.imageBackground = Utils.findRequiredViewAsType(source, R.id.background, "field 'imageBackground'", ImageView.class);
    target.imageEpisode = Utils.findRequiredViewAsType(source, R.id.imageViewOverviewEpisode, "field 'imageEpisode'", ImageView.class);
    target.textEpisodeTitle = Utils.findRequiredViewAsType(source, R.id.episodeTitle, "field 'textEpisodeTitle'", TextView.class);
    target.textEpisodeTime = Utils.findRequiredViewAsType(source, R.id.episodeTime, "field 'textEpisodeTime'", TextView.class);
    target.textEpisodeNumbers = Utils.findRequiredViewAsType(source, R.id.episodeInfo, "field 'textEpisodeNumbers'", TextView.class);
    target.containerEpisodePrimary = Utils.findRequiredView(source, R.id.episode_primary_container, "field 'containerEpisodePrimary'");
    target.containerEpisodeMeta = Utils.findRequiredView(source, R.id.episode_meta_container, "field 'containerEpisodeMeta'");
    target.dividerEpisodeMeta = Utils.findRequiredView(source, R.id.dividerHorizontalOverviewEpisodeMeta, "field 'dividerEpisodeMeta'");
    target.containerProgress = Utils.findRequiredView(source, R.id.progress_container, "field 'containerProgress'");
    target.containerRatings = Utils.findRequiredView(source, R.id.containerRatings, "field 'containerRatings'");
    target.dividerEpisodeButtons = Utils.findRequiredView(source, R.id.dividerEpisodeButtons, "field 'dividerEpisodeButtons'");
    target.buttonCheckin = Utils.findRequiredViewAsType(source, R.id.buttonEpisodeCheckin, "field 'buttonCheckin'", Button.class);
    target.buttonWatch = Utils.findRequiredViewAsType(source, R.id.buttonEpisodeWatched, "field 'buttonWatch'", Button.class);
    target.buttonCollect = Utils.findRequiredViewAsType(source, R.id.buttonEpisodeCollected, "field 'buttonCollect'", Button.class);
    target.buttonSkip = Utils.findRequiredViewAsType(source, R.id.buttonEpisodeSkip, "field 'buttonSkip'", Button.class);
    target.textDescription = Utils.findRequiredViewAsType(source, R.id.TextViewEpisodeDescription, "field 'textDescription'", TextView.class);
    target.labelDvdNumber = Utils.findRequiredView(source, R.id.labelDvd, "field 'labelDvdNumber'");
    target.textDvdNumber = Utils.findRequiredViewAsType(source, R.id.textViewEpisodeDVDnumber, "field 'textDvdNumber'", TextView.class);
    target.labelGuestStars = Utils.findRequiredView(source, R.id.labelGuestStars, "field 'labelGuestStars'");
    target.textGuestStars = Utils.findRequiredViewAsType(source, R.id.TextViewEpisodeGuestStars, "field 'textGuestStars'", TextView.class);
    target.textRating = Utils.findRequiredViewAsType(source, R.id.textViewRatingsValue, "field 'textRating'", TextView.class);
    target.textRatingVotes = Utils.findRequiredViewAsType(source, R.id.textViewRatingsVotes, "field 'textRatingVotes'", TextView.class);
    target.textUserRating = Utils.findRequiredViewAsType(source, R.id.textViewRatingsUser, "field 'textUserRating'", TextView.class);
    target.buttonImdb = Utils.findRequiredViewAsType(source, R.id.buttonEpisodeImdb, "field 'buttonImdb'", Button.class);
    target.buttonTvdb = Utils.findRequiredViewAsType(source, R.id.buttonEpisodeTvdb, "field 'buttonTvdb'", Button.class);
    target.buttonTrakt = Utils.findRequiredViewAsType(source, R.id.buttonEpisodeTrakt, "field 'buttonTrakt'", Button.class);
    target.buttonComments = Utils.findRequiredViewAsType(source, R.id.buttonEpisodeComments, "field 'buttonComments'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    OverviewFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.containerShow = null;
    target.feedbackViewStub = null;
    target.feedbackView = null;
    target.buttonFavorite = null;
    target.containerEpisode = null;
    target.containerActions = null;
    target.imageBackground = null;
    target.imageEpisode = null;
    target.textEpisodeTitle = null;
    target.textEpisodeTime = null;
    target.textEpisodeNumbers = null;
    target.containerEpisodePrimary = null;
    target.containerEpisodeMeta = null;
    target.dividerEpisodeMeta = null;
    target.containerProgress = null;
    target.containerRatings = null;
    target.dividerEpisodeButtons = null;
    target.buttonCheckin = null;
    target.buttonWatch = null;
    target.buttonCollect = null;
    target.buttonSkip = null;
    target.textDescription = null;
    target.labelDvdNumber = null;
    target.textDvdNumber = null;
    target.labelGuestStars = null;
    target.textGuestStars = null;
    target.textRating = null;
    target.textRatingVotes = null;
    target.textUserRating = null;
    target.buttonImdb = null;
    target.buttonTvdb = null;
    target.buttonTrakt = null;
    target.buttonComments = null;
  }
}
