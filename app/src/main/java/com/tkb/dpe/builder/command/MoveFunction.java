package com.tkb.dpe.builder.command;

import android.content.Context;

/**
 * Created by tkb on 2017-07-24.
 */

public class MoveFunction implements Function {

    private AlertFunctionality alertFunctionality;
    private Context context;
    public MoveFunction(AlertFunctionality alertFunctionality,Context context) {
        this.alertFunctionality = alertFunctionality;
        this.context = context;
    }

    @Override
    public void execute() {
        alertFunctionality.move(context);
    }
}
