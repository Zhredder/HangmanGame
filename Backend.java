import java.util.*;



public class Backend {

    Stickman stickman = new Stickman();

    //Create a new word
    Word word = new Word("wellington", 10);

    //size of the word - amount of dashes to show
    int wordSize = word.getSize();

    //Contains the entire word - array already filled
    char[] wordLetters = new char[wordSize]; //[p, a, r, i , s]

    //Initially empty, added with words as the user guesses
    char[] fillLetters = new char[wordSize];

    //the letters of the word to be stored
    String wordDashes = word.getName();
    

    public void startGame(){

        //get the input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("What is the capital of New Zealand?");
        System.out.println();

        //loop through each position in the array and print out a dash
        for(int i = 0; i < wordLetters.length; i++){
            System.out.print("_ ");
            //store each letter in the char array
            wordLetters[i] = wordDashes.charAt(i);
        }

        //keeping prompting the user until the entire word is filled or person hanged
        while(!wordGuessed(fillLetters)){

        //Take the guess from the user
        char guess = (char) scanner.next().charAt(0);

        //check if the guess is in the word
        for(int i = 0; i < wordLetters.length; i++){

            if(wordLetters[i] == guess){

                //Put the guessed letter inside the fillLetters array
                fillLetters[i] = guess;
                break;
                
            }
            else if(wordLetters[i] != guess &&  i == wordLetters.length - 1){
                stickman.wrongGuess();
            }
        }

        printWord(fillLetters);
        System.out.println();
    }

    System.out.println();
    System.out.println("You win!");

    }
    /**
     * Prints the array after a correct word has been guessed
     * @param array the array to be printed
     */
    public void printWord(char[] array){

        //if the array contains a non null value, then there must be a letter in there, so 
        //print it
        
        for(int i = 0; i < array.length; i++){
            
            //if the value is not null
            if(array[i] != '\u0000'){
                System.out.print(array[i]);
            }
            else{

                System.out.print("_ ");
            }
        }
    }
    /**
     * 
     * @param array the array to be checked
     * @return true or false depending on if array is fulll or empty. Full array = word guessed
     */
    private boolean wordGuessed(char[] array){

        for(int i = 0; i < array.length; i++){

            if(array[i] == '\u0000'){
                return false;
            }
            
        }

        return true;

        
    }

    
    
}
