package org.strykeforce.myapplication;

/**
 * Created by guliani on 1/3/2017.
 */

public class ChatMessage {

    private String author;
    private String message;

    public ChatMessage(){

    }

    public ChatMessage(String author, String message){
        this.message = message;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getMessage() {
        return message;
    }
}