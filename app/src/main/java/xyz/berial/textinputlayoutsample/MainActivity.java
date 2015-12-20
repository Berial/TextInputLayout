package xyz.berial.textinputlayoutsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.CompoundButton;
import android.widget.EditText;

import xyz.berial.textinputlayout.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextInputLayout wrapper1 = (TextInputLayout) findViewById(R.id.wrapper1);
        SwitchCompat switch1 = (SwitchCompat) findViewById(R.id.switch1);
        SwitchCompat switch2 = (SwitchCompat) findViewById(R.id.switch2);
        EditText change = (EditText) findViewById(R.id.change);

        change.addTextChangedListener(new OnTextChangeAdapter() {

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() == 0) {
                    wrapper1.setCounterMaxLength(10);
                } else {
                    wrapper1.setCounterMaxLength(Integer.parseInt(s.toString()));
                }
            }
        });

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                wrapper1.setError(isChecked ? "error" : "");
                wrapper1.setErrorEnabled(isChecked);
            }
        });

        switch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                wrapper1.setCounterEnabled(isChecked);
            }
        });
    }

    class OnTextChangeAdapter implements TextWatcher {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {}

        @Override
        public void afterTextChanged(Editable s) {}
    }
}
