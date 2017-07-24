package com.tkb.dpe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tarun on 7/21/17.
 */

public class PatternListAdapter extends ArrayAdapter<PatternData> {
    private final Context context;


    public PatternListAdapter(Context context,  List<PatternData> patternDataList) {
        super(context,R.layout.row_list_view,patternDataList);
        this.context = context;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.row_list_view, parent, false);
        TextView tvName = (TextView) rowView.findViewById(R.id.tvName);

        tvName.setText(getItem(position).name());

        return rowView;
    }
}