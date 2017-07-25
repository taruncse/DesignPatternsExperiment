package com.tkb.dpe.builder;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.tkb.dpe.R;
import com.tkb.dpe.builder.command.AlertFunctionality;
import com.tkb.dpe.builder.command.EditFunction;
import com.tkb.dpe.builder.command.MoveFunction;

public class CommandActivity extends Activity {
    Button btn_left, btn_right;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command);

        btn_left = (Button)findViewById(R.id.btn_left);
        btn_right = (Button)findViewById(R.id.btn_right);

        btn_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buildLeftAlert();

            }
        });

        btn_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buildRightAlert();

            }
        });



    }

    private void buildLeftAlert() {
        AlertBuilder.leftAlert(this, "Title", "Message", new DialogInterface.OnClickListener() {
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

    private void buildRightAlert() {
        AlertBuilder.rigtAlert(this, "Title", "Message", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                AlertFunctionality alertFunctionality = new AlertFunctionality();
                if (which==DialogInterface.BUTTON_POSITIVE){
                    EditFunction editFunction = new EditFunction(alertFunctionality,CommandActivity.this);
                    editFunction.execute();
                }
            }
        });
    }
}
