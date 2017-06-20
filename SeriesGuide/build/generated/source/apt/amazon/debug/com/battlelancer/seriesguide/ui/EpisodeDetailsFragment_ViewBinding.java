// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EpisodeDetailsFragment_ViewBinding implements Unbinder {
  private EpisodeDetailsFragment target;

  @UiThread
  public EpisodeDetailsFragment_ViewBinding(EpisodeDetailsFragment target, View source) {
    this.target = target;

    target.mEpisodeContainer = Utils.findRequiredView(source, R.id.containerEpisode, "field 'mEpisodeContainer'");
    target.mRatingsContainer = Utils.findRequiredView(source, R.id.containerRatings, "field 'mRatingsContainer'");
    target.mActionsContainer = Utils.findRequiredViewAsType(source, R.id.containerEpisodeActions, "field 'mActionsContainer'", LinearLayout.class);
    target.mImageContainer = Utils.findRequiredView(source, R.id.containerEpisodeImage, "field 'mImageContainer'");
    target.mEpisodeImage = Utils.findRequiredViewAsType(source, R.id.imageViewEpisode, "field 'mEpisodeImage'", ImageView.class);
    target.mTitle = Utils.findRequiredViewAsType(source, R.id.textViewEpisodeTitle, "field 'mTitle'", TextView.class);
    target.mDescription = Utils.findRequiredViewAsType(source, R.id.textViewEpisodeDescription, "field 'mDescription'", TextView.class);
    target.mReleaseTime = Utils.findRequiredViewAsType(source, R.id.textViewEpisodeReleaseTime, "field 'mReleaseTime'", TextView.class);
    target.mReleaseDate = Utils.findRequiredViewAsType(source, R.id.textViewEpisodeReleaseDate, "field 'mReleaseDate'", TextView.class);
    target.mLastEdit = Utils.findRequiredViewAsType(source, R.id.textViewEpisodeLastEdit, "field 'mLastEdit'", TextView.class);
    target.mLabelGuestStars = Utils.findRequiredView(source, R.id.labelEpisodeGuestStars, "field 'mLabelGuestStars'");
    target.mGuestStars = Utils.findRequiredViewAsType(source, R.id.textViewEpisodeGuestStars, "field 'mGuestStars'", TextView.class);
    target.mDirectors = Utils.findRequiredViewAsType(source, R.id.textViewEpisodeDirectors, "field 'mDirectors'", TextView.class);
    target.mWriters = Utils.findRequiredViewAsType(source, R.id.textViewEpisodeWriters, "field 'mWriters'", TextView.class);
    target.mLabelDvd = Utils.findRequiredView(source, R.id.labelEpisodeDvd, "field 'mLabelDvd'");
    target.mDvd = Utils.findRequiredViewAsType(source, R.id.textViewEpisodeDvd, "field 'mDvd'", TextView.class);
    target.mTextRating = Utils.findRequiredViewAsType(source, R.id.textViewRatingsValue, "field 'mTextRating'", TextView.class);
    target.mTextRatingVotes = Utils.findRequiredViewAsType(source, R.id.textViewRatingsVotes, "field 'mTextRatingVotes'", TextView.class);
    target.mTextUserRating = Utils.findRequiredViewAsType(source, R.id.textViewRatingsUser, "field 'mTextUserRating'", TextView.class);
    target.dividerEpisodeButtons = Utils.findRequiredView(source, R.id.dividerEpisodeButtons, "field 'dividerEpisodeButtons'");
    target.buttonCheckin = Utils.findRequiredViewAsType(source, R.id.buttonEpisodeCheckin, "field 'buttonCheckin'", Button.class);
    target.buttonWatch = Utils.findRequiredViewAsType(source, R.id.buttonEpisodeWatched, "field 'buttonWatch'", Button.class);
    target.buttonCollect = Utils.findRequiredViewAsType(source, R.id.buttonEpisodeCollected, "field 'buttonCollect'", Button.class);
    target.buttonSkip = Utils.findRequiredViewAsType(source, R.id.buttonEpisodeSkip, "field 'buttonSkip'", Button.class);
    target.imdbButton = Utils.findRequiredViewAsType(source, R.id.buttonEpisodeImdb, "field 'imdbButton'", Button.class);
    target.tvdbButton = Utils.findRequiredViewAsType(source, R.id.buttonEpisodeTvdb, "field 'tvdbButton'", Button.class);
    target.traktButton = Utils.findRequiredViewAsType(source, R.id.buttonEpisodeTrakt, "field 'traktButton'", Button.class);
    target.commentsButton = Utils.findRequiredViewAsType(source, R.id.buttonEpisodeComments, "field 'commentsButton'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    EpisodeDetailsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mEpisodeContainer = null;
    target.mRatingsContainer = null;
    target.mActionsContainer = null;
    target.mImageContainer = null;
    target.mEpisodeImage = null;
    target.mTitle = null;
    target.mDescription = null;
    target.mReleaseTime = null;
    target.mReleaseDate = null;
    target.mLastEdit = null;
    target.mLabelGuestStars = null;
    target.mGuestStars = null;
    target.mDirectors = null;
    target.mWriters = null;
    target.mLabelDvd = null;
    target.mDvd = null;
    target.mTextRating = null;
    target.mTextRatingVotes = null;
    target.mTextUserRating = null;
    target.dividerEpisodeButtons = null;
    target.buttonCheckin = null;
    target.buttonWatch = null;
    target.buttonCollect = null;
    target.buttonSkip = null;
    target.imdbButton = null;
    target.tvdbButton = null;
    target.traktButton = null;
    target.commentsButton = null;
  }
}
