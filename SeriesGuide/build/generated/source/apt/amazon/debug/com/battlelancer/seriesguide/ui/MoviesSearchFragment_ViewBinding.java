// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import com.battlelancer.seriesguide.widgets.EmptyView;
import com.battlelancer.seriesguide.widgets.EmptyViewSwipeRefreshLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MoviesSearchFragment_ViewBinding implements Unbinder {
  private MoviesSearchFragment target;

  @UiThread
  public MoviesSearchFragment_ViewBinding(MoviesSearchFragment target, View source) {
    this.target = target;

    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayoutMoviesSearch, "field 'swipeRefreshLayout'", EmptyViewSwipeRefreshLayout.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerViewMoviesSearch, "field 'recyclerView'", RecyclerView.class);
    target.emptyView = Utils.findRequiredViewAsType(source, R.id.emptyViewMoviesSearch, "field 'emptyView'", EmptyView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MoviesSearchFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.swipeRefreshLayout = null;
    target.recyclerView = null;
    target.emptyView = null;
  }
}
