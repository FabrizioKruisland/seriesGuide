// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.billing.amazon;

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

public class AmazonBillingActivity_ViewBinding implements Unbinder {
  private AmazonBillingActivity target;

  @UiThread
  public AmazonBillingActivity_ViewBinding(AmazonBillingActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AmazonBillingActivity_ViewBinding(AmazonBillingActivity target, View source) {
    this.target = target;

    target.progressBar = Utils.findRequiredView(source, R.id.progressBarAmazonBilling, "field 'progressBar'");
    target.buttonSubscribe = Utils.findRequiredViewAsType(source, R.id.buttonAmazonBillingSubscribe, "field 'buttonSubscribe'", Button.class);
    target.textViewPriceSub = Utils.findRequiredViewAsType(source, R.id.textViewAmazonBillingSubPrice, "field 'textViewPriceSub'", TextView.class);
    target.buttonGetPass = Utils.findRequiredViewAsType(source, R.id.buttonAmazonBillingGetPass, "field 'buttonGetPass'", Button.class);
    target.textViewPricePass = Utils.findRequiredViewAsType(source, R.id.textViewAmazonBillingPricePass, "field 'textViewPricePass'", TextView.class);
    target.textViewIsSupporter = Utils.findRequiredViewAsType(source, R.id.textViewAmazonBillingExisting, "field 'textViewIsSupporter'", TextView.class);
    target.dismissButton = Utils.findRequiredViewAsType(source, R.id.buttonPositive, "field 'dismissButton'", Button.class);
    target.hiddenButton = Utils.findRequiredViewAsType(source, R.id.buttonNegative, "field 'hiddenButton'", Button.class);
    target.buttonMoreInfo = Utils.findRequiredView(source, R.id.textViewAmazonBillingMoreInfo, "field 'buttonMoreInfo'");
  }

  @Override
  @CallSuper
  public void unbind() {
    AmazonBillingActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.progressBar = null;
    target.buttonSubscribe = null;
    target.textViewPriceSub = null;
    target.buttonGetPass = null;
    target.textViewPricePass = null;
    target.textViewIsSupporter = null;
    target.dismissButton = null;
    target.hiddenButton = null;
    target.buttonMoreInfo = null;
  }
}
