// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.adapters;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SeasonsAdapter$ViewHolder_ViewBinding implements Unbinder {
  private SeasonsAdapter.ViewHolder target;

  @UiThread
  public SeasonsAdapter$ViewHolder_ViewBinding(SeasonsAdapter.ViewHolder target, View source) {
    this.target = target;

    target.seasonTitle = Utils.findRequiredViewAsType(source, R.id.textViewSeasonTitle, "field 'seasonTitle'", TextView.class);
    target.seasonProgress = Utils.findRequiredViewAsType(source, R.id.textViewSeasonProgress, "field 'seasonProgress'", TextView.class);
    target.seasonProgressBar = Utils.findRequiredViewAsType(source, R.id.progressBarSeason, "field 'seasonProgressBar'", ProgressBar.class);
    target.seasonWatchCount = Utils.findRequiredViewAsType(source, R.id.textViewSeasonWatchCount, "field 'seasonWatchCount'", TextView.class);
    target.seasonSkipped = Utils.findRequiredView(source, R.id.imageViewSeasonSkipped, "field 'seasonSkipped'");
    target.contextMenu = Utils.findRequiredViewAsType(source, R.id.imageViewContextMenu, "field 'contextMenu'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SeasonsAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.seasonTitle = null;
    target.seasonProgress = null;
    target.seasonProgressBar = null;
    target.seasonWatchCount = null;
    target.seasonSkipped = null;
    target.contextMenu = null;
  }
}
