// Write your code here.

package com.example.player;

import java.util.*;

class Player{
    private int playerId;
    private String playerName;
    private String role;
    private int jerseyNumber;

    public Player(int PlayerId,String playerName,int jerseyNumber,String role){
        this.playerId =PlayerId;
        this.playerName = playerName;
        this.jerseyNumber =jerseyNumber;
        this.role = role;
    }    
    
    public int getId() {
        return playerId;
    }

    public void setId(int id) {
        this.playerId = id;
    }

    public String getName() {
        return playerName;
    }

    public void setName(String name) {
        this.playerName = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int num) {
        this.jerseyNumber = num;
    }
    

}