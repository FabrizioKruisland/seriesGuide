// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui.dialogs;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NotificationSelectionDialogFragment_ViewBinding implements Unbinder {
  private NotificationSelectionDialogFragment target;

  @UiThread
  public NotificationSelectionDialogFragment_ViewBinding(NotificationSelectionDialogFragment target,
      View source) {
    this.target = target;

    target.textViewEmpty = Utils.findRequiredViewAsType(source, R.id.textViewSelectionEmpty, "field 'textViewEmpty'", TextView.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerViewSelection, "field 'recyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NotificationSelectionDialogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textViewEmpty = null;
    target.recyclerView = null;
  }
}
