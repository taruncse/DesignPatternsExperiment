package com.tkb.dpe.builder;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.tkb.dpe.R;
import com.tkb.dpe.builder.command.AlertFunctionality;
import com.tkb.dpe.builder.command.EditFunction;
import com.tkb.dpe.builder.command.MoveFunction;

public class CommandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        AlertBuilder.confirm(this, "Title", "Message", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                AlertFunctionality alertFunctionality = new AlertFunctionality();
                if (which==DialogInterface.BUTTON_POSITIVE){
                    EditFunction editFunction = new EditFunction(alertFunctionality,CommandActivity.this);
                    editFunction.execute();
                }else if (which==DialogInterface.BUTTON_NEUTRAL){
                    MoveFunction moveFunction = new MoveFunction(alertFunctionality,CommandActivity.this);
                    moveFunction.execute();
                }
            }
        });
    }

}
