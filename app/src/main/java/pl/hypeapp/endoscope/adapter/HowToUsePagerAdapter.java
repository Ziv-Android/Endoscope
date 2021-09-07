package pl.hypeapp.endoscope.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import pl.hypeapp.endoscope.ui.fragment.HowToUseFragmentFactory;

public class HowToUsePagerAdapter extends FragmentPagerAdapter {
    private static final int HOW_TO_USE_PAGES = 4;

    public HowToUsePagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return HowToUseFragmentFactory.newInstance(position);
    }

    @Override
    public int getCount() {
        return HOW_TO_USE_PAGES;
    }
}
