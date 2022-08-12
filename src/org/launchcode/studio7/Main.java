package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
CD cdRoom = new CD("Cd-Room","D",4,new ArrayList<>(Arrays.asList("Music")));
DVD dvd = new DVD("DVD-d","I",16,new ArrayList<>(Arrays.asList("Music","Movies","video")));
        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println(cdRoom.toString()+"\n");
        System.out.println(dvd.toString());
    }
}