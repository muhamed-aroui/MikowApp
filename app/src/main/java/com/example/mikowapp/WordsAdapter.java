package com.example.mikowapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordsAdapter extends ArrayAdapter<Word> {
    public WordsAdapter(Activity context, ArrayList<Word> words){
        super(context,0,words);

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listWordsView = convertView;
        if(listWordsView == null) {
            listWordsView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
         Word currentWord = getItem(position);

        TextView defaultTranslation = listWordsView.findViewById(R.id.default_text_view);
        defaultTranslation.setText(currentWord.getDefaultTranslation());

        TextView MiwokTranslation = listWordsView.findViewById(R.id.mikow_text_view);
        MiwokTranslation.setText(currentWord.getMiwokTranslation());
        return listWordsView;
    }
}
