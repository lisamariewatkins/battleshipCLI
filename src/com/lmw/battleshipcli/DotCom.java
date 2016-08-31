package com.lmw.battleshipcli;

import java.util.ArrayList;

/**
 * Created by lisam on 8/31/2016.
 */

public class DotCom {
    //instance variables
    private ArrayList<String> locationCells;

    //methods
    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }

    String checkYourself(String userInput){
        String result = "miss";

        int index = locationCells.indexOf(userInput);
        if (index >= 0){
            locationCells.remove(index);

            if(locationCells.isEmpty()){
                result = "kill";
            }else{
                reuslt = "hit";
            }
        }

        return result;
    }
}
