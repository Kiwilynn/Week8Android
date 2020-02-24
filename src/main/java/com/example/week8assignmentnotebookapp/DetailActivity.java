package com.example.week8assignmentnotebookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    private static final String TAG = "DetailActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

       /* Intent intent = getIntent();
        Bundle bundle =  intent.getExtras();


        if (bundle != null) {
            System.out.println("Row number : " + bundle.getBundle("RowNumber"));
        }
        for (Notes no: NoteStorage.getList()){
            System.out.println(no.getHeadLine() + " " + no.getBody());
        } */
    }
}
