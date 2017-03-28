package com.androidaccelarate.guiadebolsosustentavel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DicasSustentaveis3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicas_sustentaveis3);


        //Para voltar a tela inicial
        TextView voltar = (TextView) findViewById(R.id.DS3_voltar);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DicasSustentaveis3Activity.this, MainActivity.class);
                startActivity(i);
            }
        });

        String[] dicasSustentaveis3 = getResources().getStringArray(R.array.dicasSustentavei3Array);

        ArrayList<Item> itensList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            String text = dicasSustentaveis3[i];

            Item item = new Item(text);
            itensList.add(item);
        }

        ItemAdapter adapter = new ItemAdapter(this, itensList);
        ListView listView = (ListView) findViewById(R.id.DS3_List);
        listView.setAdapter(adapter);

    }
}
