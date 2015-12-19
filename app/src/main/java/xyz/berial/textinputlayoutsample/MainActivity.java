package xyz.berial.textinputlayoutsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;

import xyz.berial.textinputlayout.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextInputLayout wrapper1 = (TextInputLayout) findViewById(R.id.wrapper1);
        SwitchCompat switch1 = (SwitchCompat) findViewById(R.id.switch1);
        SwitchCompat switch2 = (SwitchCompat) findViewById(R.id.switch2);


        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                wrapper1.setError(isChecked ? "error" : "");
                wrapper1.setErrorEnabled(true);
            }
        });

        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                wrapper1.setCounterEnabled(isChecked);
            }
        });
    }
}
