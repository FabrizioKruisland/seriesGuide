// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui.dialogs;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TimeOffsetDialogFragment_ViewBinding implements Unbinder {
  private TimeOffsetDialogFragment target;

  @UiThread
  public TimeOffsetDialogFragment_ViewBinding(TimeOffsetDialogFragment target, View source) {
    this.target = target;

    target.buttonNegative = Utils.findRequiredView(source, R.id.buttonNegative, "field 'buttonNegative'");
    target.buttonPositive = Utils.findRequiredViewAsType(source, R.id.buttonPositive, "field 'buttonPositive'", Button.class);
    target.editTextValue = Utils.findRequiredViewAsType(source, R.id.editTextOffsetValue, "field 'editTextValue'", EditText.class);
    target.textViewRange = Utils.findRequiredViewAsType(source, R.id.textViewOffsetRange, "field 'textViewRange'", TextView.class);
    target.textViewSummary = Utils.findRequiredViewAsType(source, R.id.textViewOffsetSummary, "field 'textViewSummary'", TextView.class);
    target.textViewExample = Utils.findRequiredViewAsType(source, R.id.textViewOffsetExample, "field 'textViewExample'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TimeOffsetDialogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.buttonNegative = null;
    target.buttonPositive = null;
    target.editTextValue = null;
    target.textViewRange = null;
    target.textViewSummary = null;
    target.textViewExample = null;
  }
}
