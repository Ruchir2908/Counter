package com.example.caatulgupta.a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.textview);
        tv.setText(toString().valueOf(count));
    }

    public void onButtonClick(View view){
        int id = view.getId();
        Button button = (Button) view;

        TextView tv = findViewById(R.id.textview);
        tv.setText("Count: "+count);
        count++;
    }
}
