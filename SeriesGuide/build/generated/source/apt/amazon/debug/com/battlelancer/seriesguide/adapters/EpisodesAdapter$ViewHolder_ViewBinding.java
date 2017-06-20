// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.adapters;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import com.battlelancer.seriesguide.widgets.WatchedBox;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EpisodesAdapter$ViewHolder_ViewBinding implements Unbinder {
  private EpisodesAdapter.ViewHolder target;

  @UiThread
  public EpisodesAdapter$ViewHolder_ViewBinding(EpisodesAdapter.ViewHolder target, View source) {
    this.target = target;

    target.episodeAlternativeNumbers = Utils.findRequiredViewAsType(source, R.id.textViewEpisodeAlternativeNumbers, "field 'episodeAlternativeNumbers'", TextView.class);
    target.episodeAirdate = Utils.findRequiredViewAsType(source, R.id.textViewEpisodeAirdate, "field 'episodeAirdate'", TextView.class);
    target.episodeNumber = Utils.findRequiredViewAsType(source, R.id.textViewEpisodeNumber, "field 'episodeNumber'", TextView.class);
    target.episodeTitle = Utils.findRequiredViewAsType(source, R.id.textViewEpisodeTitle, "field 'episodeTitle'", TextView.class);
    target.watchedBox = Utils.findRequiredViewAsType(source, R.id.watchedBoxEpisode, "field 'watchedBox'", WatchedBox.class);
    target.collected = Utils.findRequiredViewAsType(source, R.id.imageViewCollected, "field 'collected'", ImageView.class);
    target.contextMenu = Utils.findRequiredViewAsType(source, R.id.imageViewContextMenu, "field 'contextMenu'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    EpisodesAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.episodeAlternativeNumbers = null;
    target.episodeAirdate = null;
    target.episodeNumber = null;
    target.episodeTitle = null;
    target.watchedBox = null;
    target.collected = null;
    target.contextMenu = null;
  }
}
