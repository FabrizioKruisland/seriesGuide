// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import com.battlelancer.seriesguide.widgets.SlidingTabLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MoviesActivity_ViewBinding implements Unbinder {
  private MoviesActivity target;

  @UiThread
  public MoviesActivity_ViewBinding(MoviesActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MoviesActivity_ViewBinding(MoviesActivity target, View source) {
    this.target = target;

    target.viewPager = Utils.findRequiredViewAsType(source, R.id.viewPagerTabs, "field 'viewPager'", ViewPager.class);
    target.tabs = Utils.findRequiredViewAsType(source, R.id.tabLayoutTabs, "field 'tabs'", SlidingTabLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MoviesActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.viewPager = null;
    target.tabs = null;
  }
}
