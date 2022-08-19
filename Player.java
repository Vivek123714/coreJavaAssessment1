package com.Javapractise;

import java.util.ArrayList;
import java.util.List;

public class Player {
    //List<com.Javapractise.Player> player = new ArrayList<com.Javapractise.Player>();
    private String playerName;
    private int matchesPlayed;
    private int runs;
    private int highestScore;
    private String country;

    public Player(String playerName, int matchesPlayed, int runs, int highestScore, String country) {
        super();
        this.playerName = playerName;
        this.matchesPlayed = matchesPlayed;
        this.runs = runs;
        this.highestScore = highestScore;
        this.country = country;
    }
    public String getPlayerName() {
        return playerName;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public int getMatchesPlayed() {
        return matchesPlayed;
    }
    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }
    public int getRuns() {
        return runs;
    }
    public void setRuns(int runs) {
        this.runs = runs;
    }
    public int getHighestScore() {
        return highestScore;
    }
    public void setHighestScore(int d) {
        this.highestScore = d;
    }
    @Override
    public String toString() {
        return "[playerName=" + playerName + ", matchesPlayed=" + matchesPlayed + ", runs=" + runs
                + ", highestScore=" + highestScore + ", country=" + country + "]";
    }
}

