package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Jeffrey on 8-5-2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miwokTextview = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextview.setText(currentWord.getMiwokTranslation());

        TextView defaultTextview = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextview.setText(currentWord.getDefaultTranslation());

        return listItemView;
    }
}
