package id.futnet.fragmentexample.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import id.futnet.fragmentexample.ActivityToFragment;
import id.futnet.fragmentexample.MainActivity;
import id.futnet.fragmentexample.R;

/**
 * Created by Urip Yogantara on 1/27/2018.
 */

public class TwoFragment extends Fragment implements ActivityToFragment{
    TextView txtSecond;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_two,container,false);
        txtSecond=view.findViewById(R.id.txt_second);
        ((MainActivity)getActivity()).setListener(this);
        return view;
    }

    @Override
    public void saveData(int value) {
        txtSecond.setText(String.valueOf(value));
    }
}
