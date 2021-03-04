package com.example.gamediscs;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class GamePagerAdapter extends FragmentPagerAdapter {


    public GamePagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new SonyFragment();
        } else if (position == 1){
            return new XboxFragment();
        } else {
            return new NintendoFragment();
        }




    }

    @Override
    public int getCount() {
        return 3;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0) {
            return "SonyGames";
        } else if (position == 1){
            return "XboxGames";
        } else{
            return "NintendoGames";
        }


    }
}
