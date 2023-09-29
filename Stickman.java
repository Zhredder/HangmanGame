/**
 * Holds each body part of the stickman
 */

public class Stickman {
    private static final String PADDING = "                                  ";

    int wrongGuesses;

    public Stickman(){
        int wrongGuesses = 0;
    }

    public void wrongGuess(){
        wrongGuesses++;
        
        if(wrongGuesses == 1){
            System.out.println(PADDING + "----------");
        }
        else if(wrongGuesses == 2){
            System.out.println(PADDING + "----------");
            System.out.println(PADDING + "|");
            System.out.println(PADDING + "|");
            System.out.println(PADDING + "|");
            System.out.println(PADDING + "|");
        }
        else if(wrongGuesses == 3){
            System.out.println(PADDING + "----------");
            System.out.println(PADDING + "|");
            System.out.println(PADDING + "|");
            System.out.println(PADDING + "|");
            System.out.println(PADDING + "|");
            System.out.println(PADDING + "___");
        }
        else if(wrongGuesses == 4){
            System.out.println(PADDING + "----------");
            System.out.println(PADDING + "|         |");
            System.out.println(PADDING + "|");
            System.out.println(PADDING + "|");
            System.out.println(PADDING + "|");
            System.out.println(PADDING + "___");
        }
        else if(wrongGuesses == 5){
            System.out.println(PADDING + "----------");
            System.out.println(PADDING + "|         |");
            System.out.println(PADDING + "|        (-_-) ");
            System.out.println(PADDING + "|");
            System.out.println(PADDING + "|");
            System.out.println(PADDING + "___");
        }
        else if(wrongGuesses == 6){
            System.out.println(PADDING + "----------");
            System.out.println(PADDING + "|         |");
            System.out.println(PADDING + "|        (-_-)");
            System.out.println(PADDING + "|          |  ");
            System.out.println(PADDING + "|");
            System.out.println(PADDING + "___");
        }
        else if(wrongGuesses == 7){
            System.out.println(PADDING + "----------");
            System.out.println(PADDING + "|         |");
            System.out.println(PADDING + "|        (-_-)");
            System.out.println(PADDING + "|          |  ");
            System.out.println(PADDING + "|           \\  ");
            System.out.println(PADDING + "___");
        }
        else if(wrongGuesses == 8){
            System.out.println(PADDING + "----------");
            System.out.println(PADDING + "|         |");
            System.out.println(PADDING + "|        (-_-)");
            System.out.println(PADDING + "|          |  ");
            System.out.println(PADDING + "|         / \\  ");
            System.out.println(PADDING + "___");
        }
        else if(wrongGuesses == 9){
            System.out.println(PADDING + "----------");
            System.out.println(PADDING + "|         |");
            System.out.println(PADDING + "|        (-_-)");
            System.out.println(PADDING + "|        - |  ");
            System.out.println(PADDING + "|         / \\  ");
            System.out.println(PADDING + "___");
        }
        else if(wrongGuesses == 10){
            System.out.println(PADDING + "----------");
            System.out.println(PADDING + "|         |");
            System.out.println(PADDING + "|        (-_-)");
            System.out.println(PADDING + "|        - | - ");
            System.out.println(PADDING + "|         / \\  ");
            System.out.println(PADDING + "___");
        }
        else if(wrongGuesses == 12){
            System.out.println("Game over...");
            System.exit(0);
        }
    }
}



