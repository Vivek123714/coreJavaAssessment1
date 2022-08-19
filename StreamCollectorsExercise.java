package com.Javapractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectorsExercise {
    public static void main(String[] args) {
        List<com.Javapractise.Player> player = Arrays.asList(new com.Javapractise.Player("Sachin",400,20000,400,"India"),new com.Javapractise.Player("Raina",423,21000,420,"England"),new com.Javapractise.Player("Kohli",425,22000,425,"India"),new com.Javapractise.Player("Rohit",300,15000,500,"India"),new com.Javapractise.Player("Dhoni",200,12000,250,"India"));
        getPlayersByCountry(player);
        getTotalPlayersByCountry(player);
        getTotalRunsByCountry(player);




    }
    public static void getPlayersByCountry(List<com.Javapractise.Player> p){
        Map<Object, Object> countryNameWithPlayerName = p.stream().collect(Collectors.toMap(p1->p1.getPlayerName(),p1->p1.getCountry()));
        System.out.println(countryNameWithPlayerName);}
    public static void getPlayerNamesByCountry(List<com.Javapractise.Player> p){
        Map<Object, Object> countryNameWithPlayerName1 = p.stream().filter(player -> player.getMatchesPlayed() > 100).collect(Collectors.toMap(p1->p1.getPlayerName(),p1->p1.getCountry()));
        System.out.println(countryNameWithPlayerName1);}
    public static void getTotalPlayersByCountry(List<com.Javapractise.Player> p) {
        Map<String, Long>  n2 = p.stream().collect(Collectors.groupingBy(k -> k.getCountry(), Collectors.counting()));;
        System.out.println(n2);
    }
    public static void getTotalRunsByCountry(List<com.Javapractise.Player> p) {
        Map<String, Long>  n3 = p.stream().collect(Collectors.groupingBy(k -> k.getCountry(), Collectors.summingLong(p5->p5.getRuns())));
        System.out.println(n3);
    }
    public static void getMaxScoreByCountry(List<com.Javapractise.Player> p) {
        //Map<String, Integer>  n4 = p.stream().collect(Collectors.groupingBy(k -> k.getCountry() , Collectors.max(Comparator.comparing(com.Javapractise.Player::getRuns()).get()));
        //System.out.println(n4);

    }



}

