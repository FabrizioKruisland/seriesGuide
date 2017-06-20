// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui;

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

public class ConnectTraktFragment_ViewBinding implements Unbinder {
  private ConnectTraktFragment target;

  @UiThread
  public ConnectTraktFragment_ViewBinding(ConnectTraktFragment target, View source) {
    this.target = target;

    target.buttonConnect = Utils.findRequiredViewAsType(source, R.id.buttonPositive, "field 'buttonConnect'", Button.class);
    target.buttonCancel = Utils.findRequiredViewAsType(source, R.id.buttonNegative, "field 'buttonCancel'", Button.class);
    target.textViewAbout = Utils.findRequiredViewAsType(source, R.id.textViewAbout, "field 'textViewAbout'", TextView.class);
    target.textViewHexagonWarning = Utils.findRequiredViewAsType(source, R.id.textViewTraktInfoHexagonWarning, "field 'textViewHexagonWarning'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ConnectTraktFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.buttonConnect = null;
    target.buttonCancel = null;
    target.textViewAbout = null;
    target.textViewHexagonWarning = null;
  }
}
