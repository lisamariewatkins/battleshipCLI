package com.lmw.battleshipcli;


import java.io.*;

/**
 * Created by lisam on 8/31/2016.
 */
public class GameHelper {
    public String getUserInput(String prompt){
        String inputLine = null;

        System.out.print(prompt + " ");
        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }
}

