import java.util.Random;
import java.util.Scanner;

public class GuessingApp {
    public static void main(String[] args){
        System.out.println("Welcome to the Guessing App");
        GameConfig gameConfig = new GameConfig();
        gameConfig.showRules();

        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        int minHint = 0;

        while (attempts < gameConfig.getMax_Attempts()){
            System.out.print("Enter Your guess :");
            int guess = sc.nextInt();
            attempts++ ;
            minHint++ ;

            String result = GuessValidator.validateGuess(guess, gameConfig.getTargetNumber());
            System.out.println(result);

            String result1 = HintService.generateHint(guess, minHint);
            System.out.println(result1);

            if("Correct".equals(result)){
                break;
            }


        }



    }
}
