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

public class MoviesDiscoverAdapter$LinkViewHolder_ViewBinding implements Unbinder {
  private MoviesDiscoverAdapter.LinkViewHolder target;

  @UiThread
  public MoviesDiscoverAdapter$LinkViewHolder_ViewBinding(MoviesDiscoverAdapter.LinkViewHolder target,
      View source) {
    this.target = target;

    target.title = Utils.findRequiredViewAsType(source, R.id.textViewDiscoverLink, "field 'title'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MoviesDiscoverAdapter.LinkViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.title = null;
  }
}
