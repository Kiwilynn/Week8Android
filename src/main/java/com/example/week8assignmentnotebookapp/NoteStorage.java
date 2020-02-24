package com.example.week8assignmentnotebookapp;

import java.util.List;

public class NoteStorage {

    private static List<Notes> list;

    public static List<Notes> getList() {
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
