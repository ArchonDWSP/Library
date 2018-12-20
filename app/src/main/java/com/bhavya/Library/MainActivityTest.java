package com.bhavya.Library;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivityTest extends AppCompatActivity {

    /**
     * Here we have button add_button
     */

    EditText et;
    Button bt;
    ListView lv;
    ArrayList<String> arrayList;
    ArrayAdapter<String> adapter;

    protected void Oncreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.editText);
        bt = (Button) findViewById(R.id.add_button);
        lv = (ListView) findViewById(R.id.listLivre);

        arrayList = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(MainActivityTest.this, android.R.layout.simple_list_item_1,
                arrayList);
        lv.setAdapter(adapter);

        onBtnClick();
    }

    public void onBtnClick() {

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String result = et.getText().toString();
                arrayList.add(result);
                adapter.notifyDataSetChanged();
            }
        });
    }
}







/*

        @Override

        public void onClick(View v) {

            String result = getText().ToString();
            arrayList.add(result);
            Toast.makeText(getApplicationContext(), "it appears!", Toast.LENGTH_SHORT).show();
        }
    });





    Button btn1 = findViewById(R.id.modify_button);

        btn1.setOnClickListener(new View.OnClickListener() {
        @Override

        public void onClick(View v) {

            String result = getText().ToString();
            arrayList.add(result);
            Toast.makeText(getApplicationContext(), "Modified!", Toast.LENGTH_SHORT).show();
        }
    });





    Button btn2 = findViewById(R.id.remove_button);

        btn2.setOnClickListener(new View.OnClickListener() {
        @Override

        public void onClick(View v) {

            String result = getText().ToString();
            arrayList.add(result);
            Toast.makeText(getApplicationContext(), "Deleted!", Toast.LENGTH_SHORT).show();
        }
    });
}
*/