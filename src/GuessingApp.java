import javax.xml.validation.Validator;
import java.util.Random;
import java.util.Scanner;

public class GuessingApp {
    public static void main(String[] args) throws InvalidInputException{
        Scanner sc = new Scanner(System.in);

        System.out.println("++++++++++++++++++++++++");
        System.out.println("Welcome to Guessing App");
        System.out.println("+++++++++++++++++++++++++\n");
        System.out.print("Enter Player Name :");
        String player = sc.nextLine();

        GameConfig gameConfig = new GameConfig();
        gameConfig.showRules();

        int attempts = 0;
        int minHint = 0;

        boolean win = false ;
// Exhausts the maximum attempts
        while (attempts < gameConfig.getMax_Attempts()){
            System.out.print("Enter Your guess :");
//            user input validation before
            int guess = ValidationService.validateInput(sc.nextLine());
            attempts++ ;
            minHint++ ;

            String result = GuessValidator.validateGuess(guess, gameConfig.getTargetNumber());
            System.out.println(result);

            String result1 = HintService.generateHint(guess, minHint);
            System.out.println(result1);

            if("Correct".equals(result)){
                break;
            }

//            after the game loop completes
            StorageService.saveResult(player, attempts, win);

        }



    }
}
