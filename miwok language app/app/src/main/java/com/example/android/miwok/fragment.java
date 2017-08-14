package com.example.android.miwok;

/**
 * Created by LENOVO on 16-07-2017.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class fragment extends FragmentPagerAdapter {
    private String tabTitles[] = new String[] { "Numbers", "Colors", "Family","Phrases" };
    public fragment(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1){
            return new ColorsFragment();
        } else if (position == 2){
            return new FamilyFragment();
        }
        else {
            return new PhrasesFragment();
        }

    }

    @Override
    public int getCount()
    {
        return 4;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
