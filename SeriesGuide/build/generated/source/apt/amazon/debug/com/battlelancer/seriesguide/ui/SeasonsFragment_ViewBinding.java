// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SeasonsFragment_ViewBinding implements Unbinder {
  private SeasonsFragment target;

  @UiThread
  public SeasonsFragment_ViewBinding(SeasonsFragment target, View source) {
    this.target = target;

    target.textViewRemaining = Utils.findRequiredViewAsType(source, R.id.textViewSeasonsRemaining, "field 'textViewRemaining'", TextView.class);
    target.buttonCollectedAll = Utils.findRequiredViewAsType(source, R.id.imageViewSeasonsCollectedToggle, "field 'buttonCollectedAll'", ImageView.class);
    target.buttonWatchedAll = Utils.findRequiredViewAsType(source, R.id.imageViewSeasonsWatchedToggle, "field 'buttonWatchedAll'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SeasonsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textViewRemaining = null;
    target.buttonCollectedAll = null;
    target.buttonWatchedAll = null;
  }
}
