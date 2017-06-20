// Generated code from Butter Knife. Do not modify!
package com.battlelancer.seriesguide.dataliberation;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.SwitchCompat;
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

public class AutoBackupFragment_ViewBinding implements Unbinder {
  private AutoBackupFragment target;

  @UiThread
  public AutoBackupFragment_ViewBinding(AutoBackupFragment target, View source) {
    this.target = target;

    target.switchAutoBackup = Utils.findRequiredViewAsType(source, R.id.switchAutoBackup, "field 'switchAutoBackup'", SwitchCompat.class);
    target.containerSettings = Utils.findRequiredView(source, R.id.containerAutoBackupSettings, "field 'containerSettings'");
    target.checkBoxDefaultFiles = Utils.findRequiredViewAsType(source, R.id.checkBoxAutoBackupDefaultFiles, "field 'checkBoxDefaultFiles'", CheckBox.class);
    target.textShowsExportFile = Utils.findRequiredViewAsType(source, R.id.textViewAutoBackupShowsExportFile, "field 'textShowsExportFile'", TextView.class);
    target.buttonShowsExportFile = Utils.findRequiredViewAsType(source, R.id.buttonAutoBackupShowsExportFile, "field 'buttonShowsExportFile'", Button.class);
    target.textListsExportFile = Utils.findRequiredViewAsType(source, R.id.textViewAutoBackupListsExportFile, "field 'textListsExportFile'", TextView.class);
    target.buttonListsExportFile = Utils.findRequiredViewAsType(source, R.id.buttonAutoBackupListsExportFile, "field 'buttonListsExportFile'", Button.class);
    target.textMoviesExportFile = Utils.findRequiredViewAsType(source, R.id.textViewAutoBackupMoviesExportFile, "field 'textMoviesExportFile'", TextView.class);
    target.buttonMoviesExportFile = Utils.findRequiredViewAsType(source, R.id.buttonAutoBackupMoviesExportFile, "field 'buttonMoviesExportFile'", Button.class);
    target.checkBoxImportWarning = Utils.findRequiredViewAsType(source, R.id.checkBoxAutoBackupImportWarning, "field 'checkBoxImportWarning'", CheckBox.class);
    target.textViewLastAutoBackup = Utils.findRequiredViewAsType(source, R.id.textViewAutoBackupLastTime, "field 'textViewLastAutoBackup'", TextView.class);
    target.buttonImportAutoBackup = Utils.findRequiredViewAsType(source, R.id.buttonAutoBackupImport, "field 'buttonImportAutoBackup'", Button.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.progressBarAutoBackup, "field 'progressBar'", ProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AutoBackupFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.switchAutoBackup = null;
    target.containerSettings = null;
    target.checkBoxDefaultFiles = null;
    target.textShowsExportFile = null;
    target.buttonShowsExportFile = null;
    target.textListsExportFile = null;
    target.buttonListsExportFile = null;
    target.textMoviesExportFile = null;
    target.buttonMoviesExportFile = null;
    target.checkBoxImportWarning = null;
    target.textViewLastAutoBackup = null;
    target.buttonImportAutoBackup = null;
    target.progressBar = null;
  }
}
