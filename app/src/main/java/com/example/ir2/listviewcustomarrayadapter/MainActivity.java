package com.example.ir2.listviewcustomarrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Item> itemlist = new ArrayList<Item>();
    ListView listView;
    ItemAdapter itemAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);

        // Add items to ArrayList
        addItemToArray();
        // Add items to ArrayList use loop
        addItemToArrayByLoop();


        // Create new ItemAdapter for ListView
        // ItemAdapter(have 3 parameters) -> 1.Context 2.ListViewLayout XML file(Resource) 3.ArrayList of item
        itemAdapter = new ItemAdapter(getApplicationContext(),R.layout.row,itemlist);
        // SetAdapter to ListView
        listView.setAdapter(itemAdapter);
    }

    private void addItemToArray(){
        // Add items to ArrayList by Item class
        // Item Class(have 2 parameters) -> 1.head(imageview resource) 2.title
        itemlist.add(new Item(R.drawable.picture,"TITLE : 1"));
        itemlist.add(new Item(R.drawable.picture,"TITLE : 2"));
        itemlist.add(new Item(R.drawable.picture,"TITLE : 3"));
        itemlist.add(new Item(R.drawable.picture,"TITLE : 4"));
        itemlist.add(new Item(R.drawable.picture,"TITLE : 5"));

    }


    private void addItemToArrayByLoop(){
        // Add 24 item to ArrayList use for Loop
        // Item Class(have 2 parameters) ->  1.head(imageview resource) 2.title
        for(int i=0;i<5;i++) {
            itemlist.add(new Item( R.drawable.picture, "TITLE : "+i));
        }
    }

}
