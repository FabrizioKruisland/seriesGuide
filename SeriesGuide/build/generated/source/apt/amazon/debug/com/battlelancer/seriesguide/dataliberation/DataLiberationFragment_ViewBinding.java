// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.dataliberation;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.battlelancer.seriesguide.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DataLiberationFragment_ViewBinding implements Unbinder {
  private DataLiberationFragment target;

  @UiThread
  public DataLiberationFragment_ViewBinding(DataLiberationFragment target, View source) {
    this.target = target;

    target.textShowsExportFile = Utils.findRequiredViewAsType(source, R.id.textViewDataLibShowsExportFile, "field 'textShowsExportFile'", TextView.class);
    target.buttonShowsExportFile = Utils.findRequiredViewAsType(source, R.id.buttonDataLibShowsExportFile, "field 'buttonShowsExportFile'", Button.class);
    target.textListsExportFile = Utils.findRequiredViewAsType(source, R.id.textViewDataLibListsExportFile, "field 'textListsExportFile'", TextView.class);
    target.buttonListsExportFile = Utils.findRequiredViewAsType(source, R.id.buttonDataLibListsExportFile, "field 'buttonListsExportFile'", Button.class);
    target.textMoviesExportFile = Utils.findRequiredViewAsType(source, R.id.textViewDataLibMoviesExportFile, "field 'textMoviesExportFile'", TextView.class);
    target.buttonMoviesExportFile = Utils.findRequiredViewAsType(source, R.id.buttonDataLibMoviesExportFile, "field 'buttonMoviesExportFile'", Button.class);
    target.checkBoxShows = Utils.findRequiredViewAsType(source, R.id.checkBoxDataLibShows, "field 'checkBoxShows'", CheckBox.class);
    target.checkBoxLists = Utils.findRequiredViewAsType(source, R.id.checkBoxDataLibLists, "field 'checkBoxLists'", CheckBox.class);
    target.checkBoxMovies = Utils.findRequiredViewAsType(source, R.id.checkBoxDataLibMovies, "field 'checkBoxMovies'", CheckBox.class);
    target.textShowsImportFile = Utils.findRequiredViewAsType(source, R.id.textViewDataLibShowsImportFile, "field 'textShowsImportFile'", TextView.class);
    target.buttonShowsImportFile = Utils.findRequiredViewAsType(source, R.id.buttonDataLibShowsImportFile, "field 'buttonShowsImportFile'", Button.class);
    target.textListsImportFile = Utils.findRequiredViewAsType(source, R.id.textViewDataLibListsImportFile, "field 'textListsImportFile'", TextView.class);
    target.buttonListsImportFile = Utils.findRequiredViewAsType(source, R.id.buttonDataLibListsImportFile, "field 'buttonListsImportFile'", Button.class);
    target.textMoviesImportFile = Utils.findRequiredViewAsType(source, R.id.textViewDataLibMoviesImportFile, "field 'textMoviesImportFile'", TextView.class);
    target.buttonMoviesImportFile = Utils.findRequiredViewAsType(source, R.id.buttonDataLibMoviesImportFile, "field 'buttonMoviesImportFile'", Button.class);
    target.buttonExport = Utils.findRequiredViewAsType(source, R.id.buttonDataLibExport, "field 'buttonExport'", Button.class);
    target.buttonImport = Utils.findRequiredViewAsType(source, R.id.buttonDataLibImport, "field 'buttonImport'", Button.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progressBarDataLib, "field 'progressBar'", ProgressBar.class);
    target.checkBoxFullDump = Utils.findRequiredViewAsType(source, R.id.checkBoxDataLibFullDump, "field 'checkBoxFullDump'", CheckBox.class);
    target.checkBoxImportWarning = Utils.findRequiredViewAsType(source, R.id.checkBoxDataLibImportWarning, "field 'checkBoxImportWarning'", CheckBox.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DataLiberationFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textShowsExportFile = null;
    target.buttonShowsExportFile = null;
    target.textListsExportFile = null;
    target.buttonListsExportFile = null;
    target.textMoviesExportFile = null;
    target.buttonMoviesExportFile = null;
    target.checkBoxShows = null;
    target.checkBoxLists = null;
    target.checkBoxMovies = null;
    target.textShowsImportFile = null;
    target.buttonShowsImportFile = null;
    target.textListsImportFile = null;
    target.buttonListsImportFile = null;
    target.textMoviesImportFile = null;
    target.buttonMoviesImportFile = null;
    target.buttonExport = null;
    target.buttonImport = null;
    target.progressBar = null;
    target.checkBoxFullDump = null;
    target.checkBoxImportWarning = null;
  }
}
