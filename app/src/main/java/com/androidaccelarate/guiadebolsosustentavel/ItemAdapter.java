package com.androidaccelarate.guiadebolsosustentavel;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(Context context, ArrayList<Item> listaCuriosidades) {
        super(context, 0, listaCuriosidades);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.base_item, parent, false);
        }

        Item itemPosition = getItem(position);

        TextView curiosidade1 = (TextView) itemView.findViewById(R.id.base_item);
        curiosidade1.setText(itemPosition.getCuriosidade());

        TextView curiosidade2 = (TextView) itemView.findViewById(R.id.base_item);
        curiosidade2.setText(itemPosition.getCuriosidade());

        TextView curiosidade3 = (TextView) itemView.findViewById(R.id.base_item);
        curiosidade3.setText(itemPosition.getCuriosidade());

        TextView curiosidade4 = (TextView) itemView.findViewById(R.id.base_item);
        curiosidade4.setText(itemPosition.getCuriosidade());

        TextView curiosidade5 = (TextView) itemView.findViewById(R.id.base_item);
        curiosidade5.setText(itemPosition.getCuriosidade());

        return itemView;
    }
}
