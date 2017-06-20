// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui.dialogs;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MovieLocalizationDialogFragment_ViewBinding implements Unbinder {
  private MovieLocalizationDialogFragment target;

  @UiThread
  public MovieLocalizationDialogFragment_ViewBinding(MovieLocalizationDialogFragment target,
      View source) {
    this.target = target;

    target.buttonOk = Utils.findRequiredViewAsType(source, R.id.buttonPositive, "field 'buttonOk'", Button.class);
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerViewLocalization, "field 'recyclerView'", RecyclerView.class);
    target.textViewLanguage = Utils.findRequiredViewAsType(source, R.id.textViewLocalizationLanguage, "field 'textViewLanguage'", TextView.class);
    target.textViewRegion = Utils.findRequiredViewAsType(source, R.id.textViewLocalizationRegion, "field 'textViewRegion'", TextView.class);
    target.buttonLanguage = Utils.findRequiredViewAsType(source, R.id.buttonLocalizationLanguage, "field 'buttonLanguage'", Button.class);
    target.buttonRegion = Utils.findRequiredViewAsType(source, R.id.buttonLocalizationRegion, "field 'buttonRegion'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MovieLocalizationDialogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.buttonOk = null;
    target.recyclerView = null;
    target.textViewLanguage = null;
    target.textViewRegion = null;
    target.buttonLanguage = null;
    target.buttonRegion = null;
  }
}
