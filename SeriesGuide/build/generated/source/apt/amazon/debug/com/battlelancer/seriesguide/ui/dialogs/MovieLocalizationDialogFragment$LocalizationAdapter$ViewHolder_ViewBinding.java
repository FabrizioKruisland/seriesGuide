// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui.dialogs;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MovieLocalizationDialogFragment$LocalizationAdapter$ViewHolder_ViewBinding implements Unbinder {
  private MovieLocalizationDialogFragment.LocalizationAdapter.ViewHolder target;

  @UiThread
  public MovieLocalizationDialogFragment$LocalizationAdapter$ViewHolder_ViewBinding(MovieLocalizationDialogFragment.LocalizationAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.title = Utils.findRequiredViewAsType(source, android.R.id.text1, "field 'title'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MovieLocalizationDialogFragment.LocalizationAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.title = null;
  }
}
