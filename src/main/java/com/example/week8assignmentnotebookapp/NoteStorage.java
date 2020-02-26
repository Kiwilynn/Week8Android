package com.example.week8assignmentnotebookapp;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class NoteStorage {


    private static ArrayList<Notes> list = new ArrayList<>();

    public NoteStorage(ArrayList li) {
        list = li;
    }

    public static ArrayList<Notes> getList() {
        return list;
    }

    public static void addToList(String headLine, String body){
        list.add(new Notes(headLine, body));
    }
    public static void createList(String headLine){
        list.add(new Notes(headLine));
    }
    public static void addBodyToList(String body, int position){
        list.get(position).setBody(body);

    }
}
