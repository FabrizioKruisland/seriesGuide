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

public class SearchResultsAdapter$ViewHolder_ViewBinding implements Unbinder {
  private SearchResultsAdapter.ViewHolder target;

  @UiThread
  public SearchResultsAdapter$ViewHolder_ViewBinding(SearchResultsAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.showTitle = Utils.findRequiredViewAsType(source, R.id.textViewShowTitle, "field 'showTitle'", TextView.class);
    target.episodeTitle = Utils.findRequiredViewAsType(source, R.id.textViewEpisodeTitle, "field 'episodeTitle'", TextView.class);
    target.searchSnippet = Utils.findRequiredViewAsType(source, R.id.textViewSearchSnippet, "field 'searchSnippet'", TextView.class);
    target.watchedStatus = Utils.findRequiredViewAsType(source, R.id.imageViewWatchedStatus, "field 'watchedStatus'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SearchResultsAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.showTitle = null;
    target.episodeTitle = null;
    target.searchSnippet = null;
    target.watchedStatus = null;
  }
}
