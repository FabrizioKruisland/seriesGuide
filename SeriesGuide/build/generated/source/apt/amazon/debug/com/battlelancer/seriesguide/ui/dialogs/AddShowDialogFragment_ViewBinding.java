// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui.dialogs;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddShowDialogFragment_ViewBinding implements Unbinder {
  private AddShowDialogFragment target;

  @UiThread
  public AddShowDialogFragment_ViewBinding(AddShowDialogFragment target, View source) {
    this.target = target;

    target.title = Utils.findRequiredViewAsType(source, R.id.textViewAddTitle, "field 'title'", TextView.class);
    target.showmeta = Utils.findRequiredViewAsType(source, R.id.textViewAddShowMeta, "field 'showmeta'", TextView.class);
    target.overview = Utils.findRequiredViewAsType(source, R.id.textViewAddDescription, "field 'overview'", TextView.class);
    target.rating = Utils.findRequiredViewAsType(source, R.id.textViewAddRatingValue, "field 'rating'", TextView.class);
    target.genres = Utils.findRequiredViewAsType(source, R.id.textViewAddGenres, "field 'genres'", TextView.class);
    target.releasedTextView = Utils.findRequiredViewAsType(source, R.id.textViewAddReleased, "field 'releasedTextView'", TextView.class);
    target.poster = Utils.findRequiredViewAsType(source, R.id.imageViewAddPoster, "field 'poster'", ImageView.class);
    target.buttonPositive = Utils.findRequiredViewAsType(source, R.id.buttonPositive, "field 'buttonPositive'", Button.class);
    target.buttonNegative = Utils.findRequiredViewAsType(source, R.id.buttonNegative, "field 'buttonNegative'", Button.class);
    target.progressBar = Utils.findRequiredView(source, R.id.progressBarAdd, "field 'progressBar'");
    target.labelViews = Utils.listOf(
        Utils.findRequiredView(source, R.id.textViewAddRatingValue, "field 'labelViews'"), 
        Utils.findRequiredView(source, R.id.textViewAddRatingLabel, "field 'labelViews'"), 
        Utils.findRequiredView(source, R.id.textViewAddRatingRange, "field 'labelViews'"), 
        Utils.findRequiredView(source, R.id.textViewAddGenresLabel, "field 'labelViews'"));
  }

  @Override
  @CallSuper
  public void unbind() {
    AddShowDialogFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.title = null;
    target.showmeta = null;
    target.overview = null;
    target.rating = null;
    target.genres = null;
    target.releasedTextView = null;
    target.poster = null;
    target.buttonPositive = null;
    target.buttonNegative = null;
    target.progressBar = null;
    target.labelViews = null;
  }
}
