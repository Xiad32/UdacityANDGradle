package com.example.jokesprovider;

import java.util.Random;

public class JokesSource {

    static String[] jokes = {
            "This is the first Joke",
            "This is supposed to be funny",
            "This is just for the heck of it"
    };


    static public String getAJoke(){
        Random rand = new Random();
        int  index =  rand.nextInt(jokes.length - 1  );
        return jokes[index];
    }


}
