package com.lmw.battleshipcli;

/**
 * Created by lisam on 8/31/2016.
 */
public class DotCom {
    private int[] locationCells;
    private int numOfHits = 0;

    String checkYourself(String guess){
        for(int cell:locationCells){
            if(guess == locationCells[cell]){
                return "Hit";
            }
            else{
                return "Miss";
            }
        }

    }

    void setLocationCells(int[] loc){

    }
}
