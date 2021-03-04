package com.example.gamediscs;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class  SonyFragment extends Fragment {

    private GameAdapter SonyGameAdapter;
    List<Game> SonyGame;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sony, container, false);

        SonyGame = new ArrayList<>();
        SonyGame.add(new Game("GodOfWar:ChainsOfOlympus", R.drawable.cop));
        SonyGame.add(new Game("GodOfwar:GhostOfSparta", R.drawable.gos));
        SonyGame.add(new Game("GodOfWar1", R.drawable.gow1));
        SonyGame.add(new Game("GodofWar2", R.drawable.gow2));
        SonyGame.add(new Game("GodofWar:Ascension", R.drawable.ascension));

        SonyGameAdapter = new GameAdapter(getContext(), SonyGame, R.color.category_sony);
        ListView listView = (ListView) view.findViewById(R.id.list_sony);
        listView.setAdapter(SonyGameAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               Game game=SonyGame.get(position);
               GameFragment Fragment=new GameFragment();
               Bundle bundle=new Bundle();
               bundle.putInt("imageId",game.getImageResourceId());
               bundle.putString("key",game.getGame());
               Fragment.setArguments(bundle);
             getFragmentManager().beginTransaction().replace(((ViewGroup)getView().getParent()).getId(),Fragment).commit();



            }
        });




        return  view;


    }



}