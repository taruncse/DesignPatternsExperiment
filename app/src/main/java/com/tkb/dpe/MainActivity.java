package com.tkb.dpe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView lvPattern;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvPattern = (ListView)findViewById(R.id.lvPattern);
        PatternListAdapter adapter = new PatternListAdapter(this,Utility.getPatterns());
        lvPattern.setAdapter(adapter);
    }
}
