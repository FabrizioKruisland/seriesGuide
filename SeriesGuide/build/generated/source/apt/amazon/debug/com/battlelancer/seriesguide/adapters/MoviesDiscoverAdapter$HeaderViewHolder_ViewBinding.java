// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.adapters;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MoviesDiscoverAdapter$HeaderViewHolder_ViewBinding implements Unbinder {
  private MoviesDiscoverAdapter.HeaderViewHolder target;

  @UiThread
  public MoviesDiscoverAdapter$HeaderViewHolder_ViewBinding(MoviesDiscoverAdapter.HeaderViewHolder target,
      View source) {
    this.target = target;

    target.header = Utils.findRequiredViewAsType(source, R.id.textViewGridHeader, "field 'header'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MoviesDiscoverAdapter.HeaderViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.header = null;
  }
}
