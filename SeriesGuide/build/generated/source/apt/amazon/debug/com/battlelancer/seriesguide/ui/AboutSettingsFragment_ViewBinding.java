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

public class AboutSettingsFragment_ViewBinding implements Unbinder {
  private AboutSettingsFragment target;

  @UiThread
  public AboutSettingsFragment_ViewBinding(AboutSettingsFragment target, View source) {
    this.target = target;

    target.textVersion = Utils.findRequiredViewAsType(source, R.id.textViewAboutVersion, "field 'textVersion'", TextView.class);
    target.buttonWebsite = Utils.findRequiredViewAsType(source, R.id.buttonAboutWebsite, "field 'buttonWebsite'", Button.class);
    target.buttonTvdbTerms = Utils.findRequiredViewAsType(source, R.id.buttonAboutTvdbTerms, "field 'buttonTvdbTerms'", Button.class);
    target.buttonCreativeCommons = Utils.findRequiredViewAsType(source, R.id.buttonAboutCreativeCommons, "field 'buttonCreativeCommons'", Button.class);
    target.buttonTmdbTerms = Utils.findRequiredViewAsType(source, R.id.buttonAboutTmdbTerms, "field 'buttonTmdbTerms'", Button.class);
    target.buttonTmdbApiTerms = Utils.findRequiredViewAsType(source, R.id.buttonAboutTmdbApiTerms, "field 'buttonTmdbApiTerms'", Button.class);
    target.buttonTraktTerms = Utils.findRequiredViewAsType(source, R.id.buttonAboutTraktTerms, "field 'buttonTraktTerms'", Button.class);
    target.buttonCredits = Utils.findRequiredViewAsType(source, R.id.buttonAboutCredits, "field 'buttonCredits'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AboutSettingsFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textVersion = null;
    target.buttonWebsite = null;
    target.buttonTvdbTerms = null;
    target.buttonCreativeCommons = null;
    target.buttonTmdbTerms = null;
    target.buttonTmdbApiTerms = null;
    target.buttonTraktTerms = null;
    target.buttonCredits = null;
  }
}
