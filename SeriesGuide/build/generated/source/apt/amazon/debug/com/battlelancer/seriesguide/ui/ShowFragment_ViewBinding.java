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

public class ShowFragment_ViewBinding implements Unbinder {
  private ShowFragment target;

  @UiThread
  public ShowFragment_ViewBinding(ShowFragment target, View source) {
    this.target = target;

    target.posterBackgroundView = Utils.findRequiredViewAsType(source, R.id.imageViewShowPosterBackground, "field 'posterBackgroundView'", ImageView.class);
    target.posterContainer = Utils.findRequiredView(source, R.id.containerShowPoster, "field 'posterContainer'");
    target.posterView = Utils.findRequiredViewAsType(source, R.id.imageViewShowPoster, "field 'posterView'", ImageView.class);
    target.mTextViewStatus = Utils.findRequiredViewAsType(source, R.id.textViewShowStatus, "field 'mTextViewStatus'", TextView.class);
    target.mTextViewReleaseTime = Utils.findRequiredViewAsType(source, R.id.textViewShowReleaseTime, "field 'mTextViewReleaseTime'", TextView.class);
    target.mTextViewRuntime = Utils.findRequiredViewAsType(source, R.id.textViewShowRuntime, "field 'mTextViewRuntime'", TextView.class);
    target.mTextViewNetwork = Utils.findRequiredViewAsType(source, R.id.textViewShowNetwork, "field 'mTextViewNetwork'", TextView.class);
    target.mTextViewOverview = Utils.findRequiredViewAsType(source, R.id.textViewShowOverview, "field 'mTextViewOverview'", TextView.class);
    target.mTextViewReleaseCountry = Utils.findRequiredViewAsType(source, R.id.textViewShowReleaseCountry, "field 'mTextViewReleaseCountry'", TextView.class);
    target.mTextViewFirstRelease = Utils.findRequiredViewAsType(source, R.id.textViewShowFirstAirdate, "field 'mTextViewFirstRelease'", TextView.class);
    target.mTextViewContentRating = Utils.findRequiredViewAsType(source, R.id.textViewShowContentRating, "field 'mTextViewContentRating'", TextView.class);
    target.mTextViewGenres = Utils.findRequiredViewAsType(source, R.id.textViewShowGenres, "field 'mTextViewGenres'", TextView.class);
    target.mTextViewRatingGlobal = Utils.findRequiredViewAsType(source, R.id.textViewRatingsValue, "field 'mTextViewRatingGlobal'", TextView.class);
    target.mTextViewRatingVotes = Utils.findRequiredViewAsType(source, R.id.textViewRatingsVotes, "field 'mTextViewRatingVotes'", TextView.class);
    target.mTextViewRatingUser = Utils.findRequiredViewAsType(source, R.id.textViewRatingsUser, "field 'mTextViewRatingUser'", TextView.class);
    target.mTextViewLastEdit = Utils.findRequiredViewAsType(source, R.id.textViewShowLastEdit, "field 'mTextViewLastEdit'", TextView.class);
    target.buttonFavorite = Utils.findRequiredViewAsType(source, R.id.buttonShowFavorite, "field 'buttonFavorite'", Button.class);
    target.buttonNotify = Utils.findRequiredViewAsType(source, R.id.buttonShowNotify, "field 'buttonNotify'", Button.class);
    target.buttonHidden = Utils.findRequiredViewAsType(source, R.id.buttonShowHidden, "field 'buttonHidden'", Button.class);
    target.buttonShortcut = Utils.findRequiredViewAsType(source, R.id.buttonShowShortcut, "field 'buttonShortcut'", Button.class);
    target.buttonLanguage = Utils.findRequiredViewAsType(source, R.id.buttonShowLanguage, "field 'buttonLanguage'", Button.class);
    target.mButtonRate = Utils.findRequiredView(source, R.id.containerRatings, "field 'mButtonRate'");
    target.mButtonImdb = Utils.findRequiredViewAsType(source, R.id.buttonShowImdb, "field 'mButtonImdb'", Button.class);
    target.mButtonTvdb = Utils.findRequiredViewAsType(source, R.id.buttonShowTvdb, "field 'mButtonTvdb'", Button.class);
    target.mButtonTrakt = Utils.findRequiredViewAsType(source, R.id.buttonShowTrakt, "field 'mButtonTrakt'", Button.class);
    target.mButtonWebSearch = Utils.findRequiredViewAsType(source, R.id.buttonShowWebSearch, "field 'mButtonWebSearch'", Button.class);
    target.mButtonComments = Utils.findRequiredViewAsType(source, R.id.buttonShowComments, "field 'mButtonComments'", Button.class);
    target.buttonShare = Utils.findRequiredViewAsType(source, R.id.buttonShowShare, "field 'buttonShare'", Button.class);
    target.castLabel = Utils.findRequiredViewAsType(source, R.id.labelCast, "field 'castLabel'", TextView.class);
    target.castContainer = Utils.findRequiredViewAsType(source, R.id.containerCast, "field 'castContainer'", LinearLayout.class);
    target.crewLabel = Utils.findRequiredViewAsType(source, R.id.labelCrew, "field 'crewLabel'", TextView.class);
    target.crewContainer = Utils.findRequiredViewAsType(source, R.id.containerCrew, "field 'crewContainer'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ShowFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.posterBackgroundView = null;
    target.posterContainer = null;
    target.posterView = null;
    target.mTextViewStatus = null;
    target.mTextViewReleaseTime = null;
    target.mTextViewRuntime = null;
    target.mTextViewNetwork = null;
    target.mTextViewOverview = null;
    target.mTextViewReleaseCountry = null;
    target.mTextViewFirstRelease = null;
    target.mTextViewContentRating = null;
    target.mTextViewGenres = null;
    target.mTextViewRatingGlobal = null;
    target.mTextViewRatingVotes = null;
    target.mTextViewRatingUser = null;
    target.mTextViewLastEdit = null;
    target.buttonFavorite = null;
    target.buttonNotify = null;
    target.buttonHidden = null;
    target.buttonShortcut = null;
    target.buttonLanguage = null;
    target.mButtonRate = null;
    target.mButtonImdb = null;
    target.mButtonTvdb = null;
    target.mButtonTrakt = null;
    target.mButtonWebSearch = null;
    target.mButtonComments = null;
    target.buttonShare = null;
    target.castLabel = null;
    target.castContainer = null;
    target.crewLabel = null;
    target.crewContainer = null;
  }
}
