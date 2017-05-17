package com.example.ir2.listviewcustomarrayadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ir2 on 5/17/2017.
 */
public class ItemAdapter extends ArrayAdapter<Item> {
    int resource;

    // Constructor for ItemAdapter
    // Set resource from MainActivity to this resource
    public ItemAdapter(Context applicationContext, int row, ArrayList<Item> itemlist) {
        super(applicationContext, row, itemlist);
        this.resource = row;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout itemView;

        // ConvertView - The old view to reuse, if possible.
        // Note: You should check that this view is non-null and of an appropriate type before using.
        // If it is not possible to convert this view to display the correct data,
        // this method can create a new view.

        // Check convertView is null or not null
        if (convertView == null) {
            // Get Layout-INFLATER for create view
            itemView = new LinearLayout(getContext());
            String inflater = Context.LAYOUT_INFLATER_SERVICE;
            LayoutInflater vi = (LayoutInflater) getContext().getSystemService(inflater);
            vi.inflate(resource, itemView, true);

        }
        else {
            itemView = (LinearLayout) convertView;
        }
            // findViewById
            ImageView iv_head = (ImageView) itemView.findViewById(R.id.iv_head);
            TextView tv_title = (TextView) itemView.findViewById(R.id.tv_title);

            // Get item by position from Item class
            final Item item = getItem(position);

            // Set value
            iv_head.setImageResource(item.head);
            tv_title.setText(item.title);

        // Return view for display
        return itemView;

        }




}
