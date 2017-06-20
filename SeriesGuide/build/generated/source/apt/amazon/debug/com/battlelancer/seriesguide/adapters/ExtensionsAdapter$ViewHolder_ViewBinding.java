// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.adapters;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ExtensionsAdapter$ViewHolder_ViewBinding implements Unbinder {
  private ExtensionsAdapter.ViewHolder target;

  @UiThread
  public ExtensionsAdapter$ViewHolder_ViewBinding(ExtensionsAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.icon = Utils.findRequiredViewAsType(source, R.id.imageViewItemExtensionIcon, "field 'icon'", ImageView.class);
    target.title = Utils.findRequiredViewAsType(source, R.id.textViewItemExtensionTitle, "field 'title'", TextView.class);
    target.description = Utils.findRequiredViewAsType(source, R.id.textViewItemExtensionDescription, "field 'description'", TextView.class);
    target.settings = Utils.findRequiredViewAsType(source, R.id.imageViewItemExtensionSettings, "field 'settings'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ExtensionsAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.icon = null;
    target.title = null;
    target.description = null;
    target.settings = null;
  }
}
