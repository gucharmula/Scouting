package org.strykeforce.myapplication;

/**
 * Created by guliani on 1/3/2017.
 */

public class ChatMessage {

    private String teamNumber;
    private String points;

    public ChatMessage(){

    }

    public ChatMessage(String teamnumber, String points){
        this.points = points;
        this.teamNumber = teamnumber;
    }

    public String getTeamNumber() { return teamNumber;
    }

    public String getPoints() {
        return points;
    }
}