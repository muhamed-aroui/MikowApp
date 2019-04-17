package com.example.mikowapp;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordsAdapter extends ArrayAdapter<Word> {
    private MediaPlayer mediaPlayer;
    private int mBackgroundColorId;
    public WordsAdapter(Activity context, ArrayList<Word> words,int BackgroundColorId){

        super(context,0,words);
        mBackgroundColorId=BackgroundColorId;

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

        ImageView iconImage = listWordsView.findViewById(R.id.icon_image);

        if(currentWord.isImage()){
        iconImage.setImageResource(currentWord.getmImageResourceId());
        iconImage.setVisibility(View.VISIBLE);}
        else{iconImage.setVisibility(View.GONE);}

        View textContainer = listWordsView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mBackgroundColorId);
        textContainer.setBackgroundColor(color);



        return listWordsView;
    }
}
