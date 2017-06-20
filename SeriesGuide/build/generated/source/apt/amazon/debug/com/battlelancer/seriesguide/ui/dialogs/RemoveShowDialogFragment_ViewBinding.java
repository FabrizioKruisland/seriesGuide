// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui.dialogs;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RemoveShowDialogFragment_ViewBinding implements Unbinder {
  private RemoveShowDialogFragment target;

  @UiThread
  public RemoveShowDialogFragment_ViewBinding(RemoveShowDialogFragment target, View source) {
    this.target = target;

    target.progressBar = Utils.findRequiredView(source, R.id.progressBarRemove, "field 'progressBar'");
    target.dialogText = Utils.findRequiredViewAsType(source, R.id.textViewRemove, "field 'dialogText'", TextView.class);
    target.negativeButton = Utils.findRequiredViewAsType(source, R.id.buttonNegative, "field 'negativeButton'", Button.class);
    target.positiveButton = Utils.findRequiredViewAsType(source, R.id.buttonPositive, "field 'positiveButton'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RemoveShowDialogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.progressBar = null;
    target.dialogText = null;
    target.negativeButton = null;
    target.positiveButton = null;
  }
}
