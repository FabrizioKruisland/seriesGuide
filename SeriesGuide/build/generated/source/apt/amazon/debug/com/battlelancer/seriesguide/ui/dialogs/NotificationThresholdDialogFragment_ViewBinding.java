// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui.dialogs;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class NotificationThresholdDialogFragment_ViewBinding implements Unbinder {
  private NotificationThresholdDialogFragment target;

  @UiThread
  public NotificationThresholdDialogFragment_ViewBinding(NotificationThresholdDialogFragment target,
      View source) {
    this.target = target;

    target.buttonNegative = Utils.findRequiredView(source, R.id.buttonNegative, "field 'buttonNegative'");
    target.buttonPositive = Utils.findRequiredViewAsType(source, R.id.buttonPositive, "field 'buttonPositive'", Button.class);
    target.editTextValue = Utils.findRequiredViewAsType(source, R.id.editTextThresholdValue, "field 'editTextValue'", EditText.class);
    target.radioGroup = Utils.findRequiredViewAsType(source, R.id.radioGroupThreshold, "field 'radioGroup'", RadioGroup.class);
    target.radioButtonMinutes = Utils.findRequiredViewAsType(source, R.id.radioButtonThresholdMinutes, "field 'radioButtonMinutes'", RadioButton.class);
    target.radioButtonHours = Utils.findRequiredViewAsType(source, R.id.radioButtonThresholdHours, "field 'radioButtonHours'", RadioButton.class);
    target.radioButtonDays = Utils.findRequiredViewAsType(source, R.id.radioButtonThresholdDays, "field 'radioButtonDays'", RadioButton.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    NotificationThresholdDialogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.buttonNegative = null;
    target.buttonPositive = null;
    target.editTextValue = null;
    target.radioGroup = null;
    target.radioButtonMinutes = null;
    target.radioButtonHours = null;
    target.radioButtonDays = null;
  }
}
