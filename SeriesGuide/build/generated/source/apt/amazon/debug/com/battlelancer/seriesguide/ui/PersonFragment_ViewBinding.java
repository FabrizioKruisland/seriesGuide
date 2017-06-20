// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PersonFragment_ViewBinding implements Unbinder {
  private PersonFragment target;

  @UiThread
  public PersonFragment_ViewBinding(PersonFragment target, View source) {
    this.target = target;

    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progressBarPerson, "field 'progressBar'", ProgressBar.class);
    target.imageViewHeadshot = Utils.findRequiredViewAsType(source, R.id.imageViewPersonHeadshot, "field 'imageViewHeadshot'", ImageView.class);
    target.textViewName = Utils.findRequiredViewAsType(source, R.id.textViewPersonName, "field 'textViewName'", TextView.class);
    target.textViewBiography = Utils.findRequiredViewAsType(source, R.id.textViewPersonBiography, "field 'textViewBiography'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PersonFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.progressBar = null;
    target.imageViewHeadshot = null;
    target.textViewName = null;
    target.textViewBiography = null;
  }
}
