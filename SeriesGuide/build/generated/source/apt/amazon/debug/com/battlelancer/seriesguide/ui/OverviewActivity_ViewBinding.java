// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import butterknife.Unbinder;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class OverviewActivity_ViewBinding implements Unbinder {
  private OverviewActivity target;

  @UiThread
  public OverviewActivity_ViewBinding(OverviewActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public OverviewActivity_ViewBinding(OverviewActivity target, View source) {
    this.target = target;

    target.shadowOverviewStart = source.findViewById(R.id.viewOverviewShadowStart);
    target.shadowOverviewEnd = source.findViewById(R.id.viewOverviewShadowEnd);
    target.shadowShowBottom = source.findViewById(R.id.viewOverviewShadowBottom);
  }

  @Override
  @CallSuper
  public void unbind() {
    OverviewActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.shadowOverviewStart = null;
    target.shadowOverviewEnd = null;
    target.shadowShowBottom = null;
  }
}
