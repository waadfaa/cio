package com.example.cio;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.nio.file.spi.FileTypeDetector;

public class LoginAdapter extends FragmentPagerAdapter {

    private Context context;
    int totalTabs;

    public LoginAdapter(FragmentManager fm , Context context, int totalTabs){
        super(fm);
        this.context = context;
        this.totalTabs = totalTabs;
    }
     @Override
     public int getCount(){
        return totalTabs;
     }

    public Fragment getItem(int postion){
        switch (postion){
            case 0:
                  LoginTapFragment loginTapFragment = new LoginTapFragment();
                  return loginTapFragment;
            case 1:
                SinUpTapFragment sinUpTapFragment = new SinUpTapFragment();
                return sinUpTapFragment;
            default:
                return null;

        }
    }
}
