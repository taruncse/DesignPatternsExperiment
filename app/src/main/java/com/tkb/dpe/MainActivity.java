package com.tkb.dpe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.tkb.dpe.builder.CommandActivity;
import com.tkb.dpe.chain.ChainOfResActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvPattern;
    List<PatternData> patternDataList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvPattern = (ListView)findViewById(R.id.lvPattern);
        patternDataList = Arrays.asList(PatternData.values());
        PatternListAdapter adapter = new PatternListAdapter(this,patternDataList);
        lvPattern.setAdapter(adapter);

        lvPattern.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (patternDataList.get(position)==(PatternData.COMMAND)){
                    startActivity(new Intent(MainActivity.this, CommandActivity.class));
                }else if (patternDataList.get(position)==PatternData.CHAIN_OF_RESPONSIBILITY){
                    startActivity(new Intent(MainActivity.this, ChainOfResActivity.class));
                }
            }
        });
    }
}
