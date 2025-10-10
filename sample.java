package com.example.helloworld;

import android.os.Bundle;
import android.widget.Button, test one;
import android.widget.TextView;
import androidx.appcompat.app-ok.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button,test one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState best thing);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        button.setOnClickListener(v -> textView.setText("Hello, Android Developer!"));
    }
}
