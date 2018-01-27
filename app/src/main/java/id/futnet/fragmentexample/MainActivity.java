package id.futnet.fragmentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import id.futnet.fragmentexample.fragment.OneFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frame_one,new OneFragment())
                .commit();


    }
}
