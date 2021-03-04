package com.example.gamediscs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class XboxFragment extends Fragment {

    private GameAdapter XboxGameAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_xbox, container, false);

        List<Game> XboxGame= new ArrayList<>();
        XboxGame.add(new Game("StreetFighter:IV", R.drawable.sf42));
        XboxGame.add(new Game("Diablo:IV",R.drawable.diablo));
        XboxGame.add(new Game("The SIMS 2",R.drawable.sims));
        XboxGame.add(new Game("Onigiri",R.drawable.onigiri));
        XboxGame.add(new Game("Guardians Of Middle Earth",R.drawable.guardians));

        XboxGameAdapter = new GameAdapter(getContext(), XboxGame, R.color.category_Xbox);
        ListView listView = (ListView) view.findViewById(R.id.list_xbox);
        listView.setAdapter(XboxGameAdapter);

        return view;
    }

    @Override
    public void onStop() {
        super.onStop();
    }

}