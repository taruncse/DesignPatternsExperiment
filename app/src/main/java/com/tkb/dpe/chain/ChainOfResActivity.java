package com.tkb.dpe.chain;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.tkb.dpe.R;

public class ChainOfResActivity extends Activity {
    Button btn_transection;
    EditText et_paypal,et_bank,et_skrill,et_widthraw;
    TextView tv_result;
    Bank bank;
    Paypal paypal;
    Skrill skrill;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chain_of_res);

        initialization ();

        btn_transection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paypal = new Paypal(Long.parseLong(et_paypal.getText().toString()));

                bank = new Bank(Long.parseLong(et_bank.getText().toString()));
                skrill =   new Skrill(Long.parseLong(et_skrill.getText().toString()));

                paypal.setNext(bank);
                bank.setNext(skrill);

                paypal.pay(Double.parseDouble(et_widthraw.getText().toString()));
            }
        });
    }

    private void initialization() {
        btn_transection = (Button)findViewById(R.id.btn_transection);
        et_bank = (EditText)findViewById(R.id.et_bank);
        et_paypal = (EditText)findViewById(R.id.et_paypal);
        et_skrill = (EditText)findViewById(R.id.et_paypal);
        et_widthraw = (EditText)findViewById(R.id.et_widthraw);
        tv_result = (TextView)findViewById(R.id.tv_result);
    }

}
