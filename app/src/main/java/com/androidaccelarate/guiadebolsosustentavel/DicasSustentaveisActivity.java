package com.androidaccelarate.guiadebolsosustentavel;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DicasSustentaveisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicas_sustentaveis);

        TextView mais10dicas = (TextView) findViewById(R.id.DS_mais10dicas);
        mais10dicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DicasSustentaveisActivity.this, DicasSustentaveis2Activity.class);
                startActivity(i);
            }
        });

        String[] dicasSustentaveis = getResources().getStringArray(R.array.dicasSustentaveisArray);

        ArrayList<Item> itensList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String text = dicasSustentaveis[i];

            Item item = new Item(text);
            itensList.add(item);
        }

        ItemAdapter adapter = new ItemAdapter(this, itensList);
        ListView listView = (ListView) findViewById(R.id.DS_List);
        listView.setAdapter(adapter);
    }
}
