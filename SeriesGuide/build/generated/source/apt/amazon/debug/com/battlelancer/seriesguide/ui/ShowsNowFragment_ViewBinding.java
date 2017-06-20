// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import com.battlelancer.seriesguide.widgets.EmptyViewSwipeRefreshLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ShowsNowFragment_ViewBinding implements Unbinder {
  private ShowsNowFragment target;

  @UiThread
  public ShowsNowFragment_ViewBinding(ShowsNowFragment target, View source) {
    this.target = target;

    target.swipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayoutNow, "field 'swipeRefreshLayout'", EmptyViewSwipeRefreshLayout.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerViewNow, "field 'recyclerView'", RecyclerView.class);
    target.emptyView = Utils.findRequiredViewAsType(source, R.id.emptyViewNow, "field 'emptyView'", TextView.class);
    target.snackbar = Utils.findRequiredView(source, R.id.containerSnackbar, "field 'snackbar'");
    target.snackbarText = Utils.findRequiredViewAsType(source, R.id.textViewSnackbar, "field 'snackbarText'", TextView.class);
    target.snackbarButton = Utils.findRequiredViewAsType(source, R.id.buttonSnackbar, "field 'snackbarButton'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ShowsNowFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.swipeRefreshLayout = null;
    target.recyclerView = null;
    target.emptyView = null;
    target.snackbar = null;
    target.snackbarText = null;
    target.snackbarButton = null;
  }
}
