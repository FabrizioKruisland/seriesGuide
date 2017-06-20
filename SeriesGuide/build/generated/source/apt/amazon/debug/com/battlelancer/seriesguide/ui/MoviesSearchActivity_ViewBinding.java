// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.AutoCompleteTextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MoviesSearchActivity_ViewBinding implements Unbinder {
  private MoviesSearchActivity target;

  @UiThread
  public MoviesSearchActivity_ViewBinding(MoviesSearchActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MoviesSearchActivity_ViewBinding(MoviesSearchActivity target, View source) {
    this.target = target;

    target.containerSearchBar = Utils.findRequiredView(source, R.id.containerSearchBar, "field 'containerSearchBar'");
    target.searchView = Utils.findRequiredViewAsType(source, R.id.editTextSearchBar, "field 'searchView'", AutoCompleteTextView.class);
    target.clearButton = Utils.findRequiredView(source, R.id.imageButtonSearchClear, "field 'clearButton'");
    target.containerMoviesSearchFragment = Utils.findRequiredView(source, R.id.containerMoviesSearchFragment, "field 'containerMoviesSearchFragment'");
  }

  @Override
  @CallSuper
  public void unbind() {
    MoviesSearchActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.containerSearchBar = null;
    target.searchView = null;
    target.clearButton = null;
    target.containerMoviesSearchFragment = null;
  }
}
