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

public class MoviesAdapter$MovieViewHolder_ViewBinding implements Unbinder {
  private MoviesAdapter.MovieViewHolder target;

  @UiThread
  public MoviesAdapter$MovieViewHolder_ViewBinding(MoviesAdapter.MovieViewHolder target,
      View source) {
    this.target = target;

    target.title = Utils.findRequiredViewAsType(source, R.id.textViewMovieTitle, "field 'title'", TextView.class);
    target.date = Utils.findRequiredViewAsType(source, R.id.textViewMovieDate, "field 'date'", TextView.class);
    target.poster = Utils.findRequiredViewAsType(source, R.id.imageViewMoviePoster, "field 'poster'", ImageView.class);
    target.contextMenu = Utils.findRequiredViewAsType(source, R.id.imageViewMovieItemContextMenu, "field 'contextMenu'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MoviesAdapter.MovieViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.title = null;
    target.date = null;
    target.poster = null;
    target.contextMenu = null;
  }
}
