package com.example.gamediscs;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class GameAdapter extends ArrayAdapter<Game> {

    private final int mBackgroundColor;

    Context context;

    public GameAdapter(Context context, List<Game> Game, int mBackgroundColor) {

        super(context, 0, Game);
        this.mBackgroundColor=mBackgroundColor;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView=convertView;
        if(listItemView==null){

            listItemView= LayoutInflater.from(context).inflate(R.layout.list_item ,parent,false);

        }

        final Game currentGame = getItem(position);

        ImageView GameImageView = (ImageView) listItemView.findViewById(R.id.game_picture);
        if (currentGame.hasImage()) {
            GameImageView.setImageResource(currentGame.getImageResourceId());
            GameImageView.setVisibility(View.VISIBLE);
        } else {
            GameImageView.setVisibility(View.GONE);
        }

        TextView GameName=listItemView.findViewById(R.id.game_Name);
        GameName.setText(currentGame.getGame());

        LinearLayout textLayout = (LinearLayout) listItemView.findViewById(R.id.text_layout);
        textLayout.setBackgroundResource(mBackgroundColor);





        return listItemView;
    }
}
