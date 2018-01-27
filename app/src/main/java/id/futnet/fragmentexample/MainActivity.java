package id.futnet.fragmentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import id.futnet.fragmentexample.fragment.OneFragment;
import id.futnet.fragmentexample.fragment.TwoFragment;

public class MainActivity extends AppCompatActivity implements FragmentToActivity{
    int nilai=0;
    private ActivityToFragment activityToFragment;
    String TAG=MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frame_one,new OneFragment())
                .commit();
    }

    @Override
    public void sendData(int value) {
        nilai+=value;
        Log.d(TAG,String.valueOf(nilai));
        activityToFragment.saveData(nilai);
    }

    public void setListener(ActivityToFragment activityToFragment){
        this.activityToFragment=activityToFragment;
    }
}
