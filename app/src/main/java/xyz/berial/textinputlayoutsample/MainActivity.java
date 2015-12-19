package xyz.berial.textinputlayoutsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import xyz.berial.textinputlayout.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInputLayout wrapper1 = (TextInputLayout) findViewById(R.id.wrapper1);
        TextInputLayout wrapper2 = (TextInputLayout) findViewById(R.id.wrapper2);

//        wrapper1.setErrorEnabled(true);
//        wrapper2.setErrorEnabled(true);
//
//        wrapper1.setError("input1");
//        wrapper2.setError("input2");
    }
}
