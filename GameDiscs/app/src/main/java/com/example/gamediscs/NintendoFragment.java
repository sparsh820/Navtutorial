package com.example.gamediscs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class NintendoFragment extends Fragment {

    private GameAdapter numbersWordsAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_nintendo, container, false);

        final List<Game> nintendoGames = new ArrayList<>();

        nintendoGames.add(new Game("Pokemon HeartGold",R.drawable.hg2));

        numbersWordsAdapter = new GameAdapter(getContext(), nintendoGames, R.color.category_Nintendo);
        ListView listView = (ListView) view.findViewById(R.id.list_nin);
        listView.setAdapter(numbersWordsAdapter);

        return view;
    }

    @Override
    public void onStop() {
        super.onStop();
    }

}
