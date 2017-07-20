package com.tkb.dpe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tarun on 7/21/17.
 */

public class PatternListAdapter extends ArrayAdapter<PatternDataModel> {
    private final Context context;
    private final ArrayList<PatternDataModel> patternList;

    public PatternListAdapter(Context context, ArrayList<PatternDataModel> patternList) {
        super(context,R.layout.row_list_view,patternList);
        this.context = context;
        this.patternList = patternList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.row_list_view, parent, false);
        TextView tvName = (TextView) rowView.findViewById(R.id.tvName);

        tvName.setText(patternList.get(position).getNameOfThePatter());

        return rowView;
    }
}