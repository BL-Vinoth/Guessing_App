import java.util.Random;

public class Guessing_App {
    public static void main(String[] args){
        System.out.println("Welcome to the Guessing App");
        GameConfig gameConfig = new GameConfig();
        gameConfig.showRules();

    }
}

class GameConfig{
    private final int Min = 1 ;
    private final int Max = 100 ;
    private final int Max_Attempts = 7 ;
    private final int Max_Hints = 3 ;

    int targetNumber ;
    public GameConfig(){
        Random random = new Random();
        this.targetNumber = random.nextInt(Max-Min + 1) + Min ;
    }

    public int getTargetNumber(){return targetNumber ;}

    public int getMax_Attempts(){return Max_Attempts; }

    public int getMax_Hints(){
        return Max_Hints ;
    }

    public void showRules(){
        System.out.println("Guess a Number between " + Min + " and " +Max);
        System.out.println("You have " + Max_Attempts + " Attempts ");
        System.out.println("Hints will be provided after wrong guesses \n");
    }
}