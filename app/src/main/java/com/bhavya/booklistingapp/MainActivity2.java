package com.bhavya.booklistingapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity2 extends AppCompatActivity {

    private ListView mListView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayList<book> liste = MainActivity.bookList;

        List<String> listViewValues = new ArrayList<String>();

        for(book i: liste){
            listViewValues.add(i.getTitle());
        }

        mListView = (ListView) findViewById(R.id.listLivre);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1,
                listViewValues.toArray(new String[listViewValues.size()]));
        mListView.setAdapter(adapter);
    }
}
