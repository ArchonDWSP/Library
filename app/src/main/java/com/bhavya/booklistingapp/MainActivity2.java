package com.bhavya.booklistingapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import static com.bhavya.booklistingapp.MainActivity.bookList;


public class MainActivity2 extends AppCompatActivity {

    private ListView mListView;
    private int click = 0;
    ArrayList<book> liste;
    Button add;
    Button delete;
    Button modify;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        liste = bookList;
        add = findViewById(R.id.add_button);
        delete = findViewById(R.id.remove_button);
        modify = findViewById(R.id.modify_button);

        List<String> listViewValues = new ArrayList<String>();

        for(book i: liste){
            listViewValues.add(i.getTitle());
        }

        mListView = (ListView) findViewById(R.id.listLivre);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1,
                listViewValues.toArray(new String[listViewValues.size()]));
        mListView.setAdapter(adapter);

        onBtnClick();

    }


    public void onBtnClick() {

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText) findViewById(R.id.editText2);
                String livre = et.getText().toString() ;
                book book = new book(livre,"","","","");
                liste.add(book);
                finish();
                startActivity(getIntent());
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText) findViewById(R.id.editText2);
                int k = 0;
                for(book i: liste){
                    if(i.getTitle().equals(et.getText().toString())){
                        liste.remove(k);
                    }
                    k++;
                }
                finish();
                startActivity(getIntent());
            }
        });

        modify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int k = 0;
                int j = 0;
                if(click==0){
                    EditText et = (EditText) findViewById(R.id.editText2);
                    for(book i: liste){
                        if(i.getTitle().equals(et.getText().toString())){
                            j = k;
                        }
                        k++;
                    }
                    click = 1;
                }
                else{
                    EditText et = (EditText) findViewById(R.id.editText2);
                    book book = new book(et.getText().toString(),"","","","");
                    liste.set(j,book);
                    click = 0;
                    finish();
                    startActivity(getIntent());
                }
            }
        });
    }
}
