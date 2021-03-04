package com.example.gamediscs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class GameFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View V=inflater.inflate(R.layout.fragment_game, container,  false);
        Bundle b=getArguments();
        Integer imageId=b.getInt("imageId");
         String text=b.getString("key");
        Log.i("text",text);
        TextView textView=V.findViewById(R.id.game_Name);
        textView.setText(text);
        return V;
    }
}