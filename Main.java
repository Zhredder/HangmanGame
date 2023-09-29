import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        Backend backend = new Backend();
        
        System.out.println();

        System.out.println("Hello, welome to Hangman!");
        
        System.out.println();

        System.out.println("Guess the word and you can save this persons life, guess incorrectly and you know the rest...");
    
        System.out.println();

        System.out.println("Type enter to continue");

        String input = scanner.nextLine();
        
        //keep prompting the user until 'enter' is pressed
        while(!input.equalsIgnoreCase("enter")){
        
            System.out.println("Wrong input. Type enter to continue.");

            input = scanner.nextLine();
            
        }

        backend.startGame();
    
    }
        
    }
    

