package com.example.cardplaying;

import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class Player1 {
    public static ArrayList<ImageView> player1Cards = new ArrayList<ImageView>();
    public static int mark ;
    public static String name;
    public static boolean isActive = true;
    public static  boolean isWon = false;
    public Player1(){
        isActive = true;
    }


}
class Player2{
    public static ArrayList<ImageView> player2Cards = new ArrayList<ImageView>();
    public static int mark ;
    public static String name;
    public static boolean isActive;
    public static  boolean isWon = false;
public Player2(){
    isActive =false;
}
}
