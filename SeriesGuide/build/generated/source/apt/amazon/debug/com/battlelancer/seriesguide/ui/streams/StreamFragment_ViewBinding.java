// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui.streams;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import com.battlelancer.seriesguide.widgets.EmptyViewSwipeRefreshLayout;
import com.tonicartos.widget.stickygridheaders.StickyGridHeadersGridView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class StreamFragment_ViewBinding implements Unbinder {
  private StreamFragment target;

  @UiThread
  public StreamFragment_ViewBinding(StreamFragment target, View source) {
    this.target = target;

    target.contentContainer = Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayoutStream, "field 'contentContainer'", EmptyViewSwipeRefreshLayout.class);
    target.gridView = Utils.findRequiredViewAsType(source, R.id.gridViewStream, "field 'gridView'", StickyGridHeadersGridView.class);
    target.emptyView = Utils.findRequiredViewAsType(source, R.id.emptyViewStream, "field 'emptyView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    StreamFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.contentContainer = null;
    target.gridView = null;
    target.emptyView = null;
  }
}
