package com.tkb.dpe.builder.command;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by tkb on 2017-07-24.
 */

public class AlertFunctionality {

    public void move(Context context){

        Toast.makeText(context,"Moving",Toast.LENGTH_LONG).show();
    }
    public void Edit(Context context){
        Toast.makeText(context,"Editing",Toast.LENGTH_LONG).show();
    }
}
