package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.Even;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner gameScanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet"
                + "\n2 - Even"
                + "\n3 - Calc"
                + "\n4 - GCD"
                + "\n5 - Progression"
                + "\n6 - Prime"
                + "\n0 - Exit");
        System.out.print("Your choice: ");
        String gameNumber = gameScanner.next();

        switch (gameNumber) {
            case "0" -> System.out.println("Bye bye!");
            case "1" -> Cli.nameScaner();
            case "2" -> Even.evenGame();
            case "3" -> Calc.calculatorGame();
            case "4" -> GCD.gcdGame();
            case "5" -> Progression.progressionGame();
            case "6" -> Prime.primeGame();
            default -> System.out.println("Something wrong");
        }
    }
}

