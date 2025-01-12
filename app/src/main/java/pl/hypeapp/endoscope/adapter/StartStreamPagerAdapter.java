package pl.hypeapp.endoscope.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import pl.hypeapp.endoscope.ui.fragment.IpAddressFragment;
import pl.hypeapp.endoscope.ui.fragment.NfcFragment;
import pl.hypeapp.endoscope.ui.fragment.QrCodeFragment;


public class StartStreamPagerAdapter extends FragmentPagerAdapter {

    public StartStreamPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new IpAddressFragment();
            case 1:
                return new QrCodeFragment();
            case 2:
                return new NfcFragment();
            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
