package com.example.nameclicker;

import static com.example.nameclicker.R.string.label_text;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.nameclicker.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    private TextView just_label;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        just_label = binding.justLabel;
    }

    public void onButtonClick(View view) {
        if (just_label.getText() == getString(R.string.label_succes)) {
            just_label.setText(getString(R.string.label_text));
        } else {
            just_label.setText(getString(R.string.label_succes));
        }
    }
}


//в возд фильтре масло - почему? в фильтре через сапун или гонит турбина
//по ходовым едет - значит сапун - подуставшие