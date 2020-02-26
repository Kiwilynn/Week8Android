package com.example.week8assignmentnotebookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    private static final String TAG = "DetailActivity";
    TextView textView;
    EditText editText;
    int RowNr = 0;

    //Make edittext save to list

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        Bundle bundle =  intent.getExtras();


        if (bundle != null) {
            System.out.println("Row number : " + intent.getIntExtra("RowNumber", 0));


            textView = (TextView)findViewById(R.id.noteTextView);
            textView.setText(NoteStorage.getList().get(intent.getIntExtra("RowNumber", 0)).getHeadLine());


        }
    }
}
