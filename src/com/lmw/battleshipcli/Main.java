package com.lmw.battleshipcli;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int numOfGuesses =  0;
        GameHelper helper = new GameHelper();
        DotCom dc = new DotCom();

        int startingCell = (int)(Math.random()*5);

        int[] shipArray = {startingCell, startingCell++, startingCell + 2};

        dc.setLocationCells(shipArray);

        boolean isAlive = true;

        while(isAlive ==true){
            //get user input from cli
            String guess = helper.getUserInput("Enter a number");
            String result = dc.checkYourself(guess);
            numOfGuesses++;
            if(result.equals("kill")){
                isAlive = false;
                System.out.println("You guessed " + numOfGuesses + " times.");
            }
        }
    }
}
