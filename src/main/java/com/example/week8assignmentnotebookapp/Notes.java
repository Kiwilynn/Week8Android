package com.example.week8assignmentnotebookapp;

public class Notes {
    private String headLine;
    private String body;

    public Notes(String headLine, String body) {

    }

    public Notes(String headLine) {
        this.headLine = headLine;
    }

    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    @Override
    public String toString(){
        return headLine;
    }
}
