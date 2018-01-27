package id.futnet.fragmentexample.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import id.futnet.fragmentexample.ActivityToFragment;
import id.futnet.fragmentexample.FragmentToActivity;
import id.futnet.fragmentexample.R;

/**
 * Created by Urip Yogantara on 1/27/2018.
 */

public class OneFragment extends Fragment{
//    int nilai=0;
    Button btnOne;
    private final String TAG= OneFragment.class.getSimpleName();

    FragmentToActivity fragmentToActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_one,container,false);
        btnOne=view.findViewById(R.id.btn_one);
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"clicked");
                fragmentToActivity.sendData(1);
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        fragmentToActivity=(FragmentToActivity) context;
        super.onAttach(context);

    }
}
