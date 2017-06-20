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

public class ConnectTraktFinishedFragment_ViewBinding implements Unbinder {
  private ConnectTraktFinishedFragment target;

  @UiThread
  public ConnectTraktFinishedFragment_ViewBinding(ConnectTraktFinishedFragment target,
      View source) {
    this.target = target;

    target.buttonClose = Utils.findRequiredViewAsType(source, R.id.buttonPositive, "field 'buttonClose'", Button.class);
    target.buttonHidden = Utils.findRequiredViewAsType(source, R.id.buttonNegative, "field 'buttonHidden'", Button.class);
    target.textViewSyncMessage = Utils.findRequiredViewAsType(source, R.id.textViewConnectTraktFinished, "field 'textViewSyncMessage'", TextView.class);
    target.buttonShowLibrary = Utils.findRequiredViewAsType(source, R.id.buttonShowLibrary, "field 'buttonShowLibrary'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ConnectTraktFinishedFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.buttonClose = null;
    target.buttonHidden = null;
    target.textViewSyncMessage = null;
    target.buttonShowLibrary = null;
  }
}
