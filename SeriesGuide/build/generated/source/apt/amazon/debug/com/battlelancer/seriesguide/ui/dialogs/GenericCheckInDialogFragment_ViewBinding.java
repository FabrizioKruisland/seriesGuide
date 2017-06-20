// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui.dialogs;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GenericCheckInDialogFragment_ViewBinding implements Unbinder {
  private GenericCheckInDialogFragment target;

  @UiThread
  public GenericCheckInDialogFragment_ViewBinding(GenericCheckInDialogFragment target,
      View source) {
    this.target = target;

    target.textInputLayout = Utils.findRequiredViewAsType(source, R.id.textInputLayoutCheckIn, "field 'textInputLayout'", TextInputLayout.class);
    target.buttonCheckIn = Utils.findRequiredView(source, R.id.buttonCheckIn, "field 'buttonCheckIn'");
    target.buttonPasteTitle = Utils.findRequiredView(source, R.id.buttonCheckInPasteTitle, "field 'buttonPasteTitle'");
    target.buttonClear = Utils.findRequiredView(source, R.id.buttonCheckInClear, "field 'buttonClear'");
    target.progressBar = Utils.findRequiredView(source, R.id.progressBarCheckIn, "field 'progressBar'");
  }

  @Override
  @CallSuper
  public void unbind() {
    GenericCheckInDialogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textInputLayout = null;
    target.buttonCheckIn = null;
    target.buttonPasteTitle = null;
    target.buttonClear = null;
    target.progressBar = null;
  }
}
