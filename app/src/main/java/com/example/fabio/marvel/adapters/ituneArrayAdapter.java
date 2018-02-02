package com.example.fabio.marvel.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.fabio.marvel.R;
import com.example.fabio.marvel.pojo.itune;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fabio on 26/01/2018.
 */

public class ituneArrayAdapter extends ArrayAdapter<itune> {

    private ArrayList<itune> arrayList;

    public ituneArrayAdapter( Context context, int resource, List<itune> objects) {
        super(context, resource, objects);
        arrayList = (ArrayList<itune>) objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        itune Itune = arrayList.get(position);
        //itune Itune1 = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.itunes_layout, parent, false);
        }
        TextView collectionName = (TextView) convertView.findViewById(R.id.collection);
        TextView trackName = (TextView) convertView.findViewById(R.id.trackName);
        TextView trackPrice = (TextView) convertView.findViewById(R.id.trackPrice);
        collectionName.setText(Itune.collectionName);
        trackName.setText(Itune.trackName);
        trackPrice.setText(Itune.trackPrice + "");

        return convertView;
    }
}
