package com.tkb.dpe.builder;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import com.tkb.dpe.R;

/**
 * Created by tkb on 2017-07-24.
 */

public class AlertBuilder {

    public static void leftAlert(Context context, String title, String msg, DialogInterface.OnClickListener listener) {
        new AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(msg)
                .setPositiveButton(R.string.edit, listener)
                .setNeutralButton(R.string.move, listener)
                .setNegativeButton(android.R.string.cancel,null)
                .show();
    }

    public static void rigtAlert(Context context, String title, String msg, DialogInterface.OnClickListener listener) {
        new AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(msg)
                .setPositiveButton(R.string.edit, listener)
                .setNegativeButton(android.R.string.cancel,null)
                .show();
    }
}
