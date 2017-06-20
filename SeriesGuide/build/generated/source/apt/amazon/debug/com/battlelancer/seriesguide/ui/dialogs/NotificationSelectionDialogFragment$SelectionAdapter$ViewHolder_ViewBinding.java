// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui.dialogs;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NotificationSelectionDialogFragment$SelectionAdapter$ViewHolder_ViewBinding implements Unbinder {
  private NotificationSelectionDialogFragment.SelectionAdapter.ViewHolder target;

  @UiThread
  public NotificationSelectionDialogFragment$SelectionAdapter$ViewHolder_ViewBinding(NotificationSelectionDialogFragment.SelectionAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.switchCompat = Utils.findRequiredViewAsType(source, R.id.switchItemSelection, "field 'switchCompat'", SwitchCompat.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NotificationSelectionDialogFragment.SelectionAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.switchCompat = null;
  }
}
