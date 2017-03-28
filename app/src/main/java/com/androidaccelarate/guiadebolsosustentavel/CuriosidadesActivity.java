package com.androidaccelarate.guiadebolsosustentavel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class CuriosidadesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curiosidades);

        final String[] curiosidadesArray = getResources().getStringArray(R.array.curiosidadaArray);

        ArrayList<Item> itensList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String text = curiosidadesArray[i];

            Item item = new Item(text);
            itensList.add(item);
        }

        ItemAdapter adapter = new ItemAdapter(this, itensList);
        ListView listView = (ListView) findViewById(R.id.CR_List);
        listView.setAdapter(adapter);


    }
}
