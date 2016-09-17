package bvb.android.example.com.moad_a_div;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String LOG_CAT=MainActivity.class.getSimpleName();
    //test line from my cabin pc for gitHub
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(LOG_CAT, "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(LOG_CAT, "onStart()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(LOG_CAT, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(LOG_CAT, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(LOG_CAT, "onDestroy()");
    }
}
