package com.androidaccelarate.guiadebolsosustentavel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DicasSustentaveis2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicas_sustentaveis2);

        TextView outras10dicas = (TextView) findViewById(R.id.DS_outras10dicas);
        outras10dicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DicasSustentaveis2Activity.this, DicasSustentaveis3Activity.class);
                startActivity(i);
                //Colocando Segredos
                String segredo3 = getResources().getString(R.string.segredo3);
                Toast.makeText(DicasSustentaveis2Activity.this, segredo3, Toast.LENGTH_SHORT).show();
            }
        });


        String[] dicasSustentaveis2 = getResources().getStringArray(R.array.dicasSustentavei2Array);

        ArrayList<Item> itensList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String text = dicasSustentaveis2[i];

            Item item = new Item(text);
            itensList.add(item);
        }

        ItemAdapter adapter = new ItemAdapter(this, itensList);
        ListView listView = (ListView) findViewById(R.id.DS2_List);
        listView.setAdapter(adapter);

    }
}
