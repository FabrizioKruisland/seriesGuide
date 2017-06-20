// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import com.battlelancer.seriesguide.widgets.SlidingTabLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class EpisodesActivity_ViewBinding implements Unbinder {
  private EpisodesActivity target;

  @UiThread
  public EpisodesActivity_ViewBinding(EpisodesActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public EpisodesActivity_ViewBinding(EpisodesActivity target, View source) {
    this.target = target;

    target.episodeDetailsPager = Utils.findOptionalViewAsType(source, R.id.pagerEpisodes, "field 'episodeDetailsPager'", ViewPager.class);
    target.episodeDetailsTabs = Utils.findOptionalViewAsType(source, R.id.tabsEpisodes, "field 'episodeDetailsTabs'", SlidingTabLayout.class);
    target.backgroundImageView = Utils.findOptionalViewAsType(source, R.id.imageViewEpisodesBackground, "field 'backgroundImageView'", ImageView.class);
    target.shadowStart = source.findViewById(R.id.viewEpisodesShadowStart);
    target.shadowEnd = source.findViewById(R.id.viewEpisodesShadowEnd);
  }

  @Override
  @CallSuper
  public void unbind() {
    EpisodesActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.episodeDetailsPager = null;
    target.episodeDetailsTabs = null;
    target.backgroundImageView = null;
    target.shadowStart = null;
    target.shadowEnd = null;
  }
}
