// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui.dialogs;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddListDialogFragment_ViewBinding implements Unbinder {
  private AddListDialogFragment target;

  @UiThread
  public AddListDialogFragment_ViewBinding(AddListDialogFragment target, View source) {
    this.target = target;

    target.textInputLayoutName = Utils.findRequiredViewAsType(source, R.id.textInputLayoutListManageListName, "field 'textInputLayoutName'", TextInputLayout.class);
    target.buttonNegative = Utils.findRequiredViewAsType(source, R.id.buttonNegative, "field 'buttonNegative'", Button.class);
    target.buttonPositive = Utils.findRequiredViewAsType(source, R.id.buttonPositive, "field 'buttonPositive'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AddListDialogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textInputLayoutName = null;
    target.buttonNegative = null;
    target.buttonPositive = null;
  }
}
