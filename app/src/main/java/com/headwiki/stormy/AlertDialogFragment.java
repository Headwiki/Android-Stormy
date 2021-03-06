package com.headwiki.stormy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by Z77 on 07.10.2017.
 */

public class AlertDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle(R.string.error_alert_dialog_fragment_title)
                .setMessage(R.string.error_alert_dialog_fragment_message)
                .setPositiveButton(R.string.error_alert_dialog_fragment_positive, null);

        AlertDialog dialog = builder.create();
        return dialog;
    }
}
