// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui.dialogs;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import com.mobeta.android.dslv.DragSortListView;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ListsReorderDialogFragment_ViewBinding implements Unbinder {
  private ListsReorderDialogFragment target;

  @UiThread
  public ListsReorderDialogFragment_ViewBinding(ListsReorderDialogFragment target, View source) {
    this.target = target;

    target.dragSortListView = Utils.findRequiredViewAsType(source, R.id.listViewListsReorder, "field 'dragSortListView'", DragSortListView.class);
    target.buttonNegative = Utils.findRequiredViewAsType(source, R.id.buttonNegative, "field 'buttonNegative'", Button.class);
    target.buttonPositive = Utils.findRequiredViewAsType(source, R.id.buttonPositive, "field 'buttonPositive'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ListsReorderDialogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.dragSortListView = null;
    target.buttonNegative = null;
    target.buttonPositive = null;
  }
}
