package com.androidaccelarate.guiadebolsosustentavel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mainHighButton = (Button) findViewById(R.id.main_high_button);
        mainHighButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CuriosidadesActivity.class);
                startActivity(i);
            }
        });

        Button mainLowLeftButton = (Button) findViewById(R.id.main_low_left_button);
        mainLowLeftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button mainLowRightButton = (Button) findViewById(R.id.main_low_right_button);
        mainLowRightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
