package com.example.week8assignmentnotebookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Button addBtn;
    EditText noteName;
    Intent intent;
    ArrayList dummyList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.ListView);

        ArrayAdapter<Notes> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, NoteStorage.getList());

        listView.setAdapter(arrayAdapter);

        makeListviewItemlistener();
    }


    public void makeListviewItemlistener(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("RowNumber", position);
                startActivity(intent);

            }
        });

    }

    public void addToList(View view){

        noteName = findViewById(R.id.editText);
        addBtn = findViewById(R.id.add_btn);

        addBtn.setVisibility(View.VISIBLE);
        noteName.setVisibility(View.VISIBLE);

        addBtn.requestFocus();
        noteName.requestFocus();

    }

    public void submitToList(View view){
        noteName = findViewById(R.id.editText);
        addBtn = findViewById(R.id.add_btn);

        NoteStorage.createList(noteName.getText().toString());

        addBtn.clearFocus();
        noteName.clearFocus();

        addBtn.setVisibility(View.INVISIBLE);
        noteName.setVisibility(View.INVISIBLE);
        hideKeyboard(this);


    }

    public static void hideKeyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager) activity.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = activity.getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(activity);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }


}
