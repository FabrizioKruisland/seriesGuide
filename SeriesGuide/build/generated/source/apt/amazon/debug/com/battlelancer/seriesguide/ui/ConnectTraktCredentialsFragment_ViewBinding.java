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

public class ConnectTraktCredentialsFragment_ViewBinding implements Unbinder {
  private ConnectTraktCredentialsFragment target;

  @UiThread
  public ConnectTraktCredentialsFragment_ViewBinding(ConnectTraktCredentialsFragment target,
      View source) {
    this.target = target;

    target.buttonConnect = Utils.findRequiredViewAsType(source, R.id.buttonPositive, "field 'buttonConnect'", Button.class);
    target.buttonDisconnect = Utils.findRequiredViewAsType(source, R.id.buttonNegative, "field 'buttonDisconnect'", Button.class);
    target.textViewUsernameLabel = Utils.findRequiredView(source, R.id.textViewConnectTraktUsernameLabel, "field 'textViewUsernameLabel'");
    target.textViewUsername = Utils.findRequiredViewAsType(source, R.id.textViewConnectTraktUsername, "field 'textViewUsername'", TextView.class);
    target.textViewHexagonWarning = Utils.findRequiredViewAsType(source, R.id.textViewConnectTraktHexagonWarning, "field 'textViewHexagonWarning'", TextView.class);
    target.progressBar = Utils.findRequiredView(source, R.id.progressBarConnectTrakt, "field 'progressBar'");
    target.textViewStatus = Utils.findRequiredViewAsType(source, R.id.textViewConnectTraktStatus, "field 'textViewStatus'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ConnectTraktCredentialsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.buttonConnect = null;
    target.buttonDisconnect = null;
    target.textViewUsernameLabel = null;
    target.textViewUsername = null;
    target.textViewHexagonWarning = null;
    target.progressBar = null;
    target.textViewStatus = null;
  }
}
