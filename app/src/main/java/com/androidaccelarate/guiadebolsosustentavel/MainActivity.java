package com.androidaccelarate.guiadebolsosustentavel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Botão: Dicas de Sustentabilidade
        Button mainHighButton = (Button) findViewById(R.id.main_high_button);
        mainHighButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, DicasSustentaveisActivity.class);
                startActivity(i);
                //Colocando Segredos
                String segredo = getResources().getString(R.string.segredo);
                Toast.makeText(MainActivity.this, segredo, Toast.LENGTH_SHORT).show();
            }
        });

        //Botão: Coleta Seletiva
        Button mainLowLeftButton = (Button) findViewById(R.id.main_low_left_button);
        mainLowLeftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ColetaSeletivaActivity.class);
                startActivity(i);
            }
        });

        //Botão: Curiosidades
        Button mainLowRightButton = (Button) findViewById(R.id.main_low_right_button);
        mainLowRightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CuriosidadesActivity.class);
                startActivity(i);
            }
        });

        //Segredo
        TextView mainHighSecret = (TextView) findViewById(R.id.main_high_text);
        mainHighSecret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String secret = getResources().getString(R.string.informacaoSecreta);
                Toast.makeText(MainActivity.this, secret, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
