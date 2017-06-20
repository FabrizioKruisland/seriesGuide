// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.AutoCompleteTextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import com.battlelancer.seriesguide.widgets.SlidingTabLayout;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SearchActivity_ViewBinding implements Unbinder {
  private SearchActivity target;

  @UiThread
  public SearchActivity_ViewBinding(SearchActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SearchActivity_ViewBinding(SearchActivity target, View source) {
    this.target = target;

    target.searchContainer = Utils.findRequiredView(source, R.id.containerSearchBar, "field 'searchContainer'");
    target.searchView = Utils.findRequiredViewAsType(source, R.id.editTextSearchBar, "field 'searchView'", AutoCompleteTextView.class);
    target.clearButton = Utils.findRequiredView(source, R.id.imageButtonSearchClear, "field 'clearButton'");
    target.tabs = Utils.findRequiredViewAsType(source, R.id.tabsSearch, "field 'tabs'", SlidingTabLayout.class);
    target.viewPager = Utils.findRequiredViewAsType(source, R.id.pagerSearch, "field 'viewPager'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SearchActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.searchContainer = null;
    target.searchView = null;
    target.clearButton = null;
    target.tabs = null;
    target.viewPager = null;
  }
}
