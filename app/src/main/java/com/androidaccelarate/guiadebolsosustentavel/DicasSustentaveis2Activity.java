package com.androidaccelarate.guiadebolsosustentavel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class DicasSustentaveis2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicas_sustentaveis2);

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
