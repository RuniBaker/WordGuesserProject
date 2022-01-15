import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Guess the Word:");
        Random rn = new Random();
        int randomInt = rn.nextInt(10) + 1;
        switch (randomInt){
            case 1 -> System.out.println("A_PL_");
            case 2 -> System.out.println("_U_TO_");
            case 3 -> System.out.println("J_A_S");
            case 4 -> System.out.println("BO__S");
            case 5 -> System.out.println("D_IN_");
            case 6 -> System.out.println("_AVA");
            case 7 -> System.out.println("W_T_R");
            case 8 -> System.out.println("C_O_OL_T_");
            case 9 -> System.out.println("M_LK");
            case 10 -> System.out.println("_EA");
            }

        boolean foundIt = true;
        OUTERLOOP:
        for (int i = 3; i >= 0 ; i--) {
            Scanner scanner = new Scanner(System.in);
            String playerGuess = scanner.nextLine();

            if (playerGuess.equals("APPLE")) {
                foundIt = false;
                break OUTERLOOP;
            } else if (playerGuess.equals("BUTTON")) {
                foundIt = false;
                break OUTERLOOP;
            } else if (playerGuess.equals("JEANS")) {
                foundIt = false;
                break OUTERLOOP;
            } else if (playerGuess.equals("BOOTS")) {
                foundIt = false;
                break OUTERLOOP;
            } else if (playerGuess.equals("DRINK")) {
                foundIt = false;
                break OUTERLOOP;
            } else if (playerGuess.equals("JAVA")) {
                foundIt = false;
                break OUTERLOOP;
            } else if (playerGuess.equals("CHOCOLATE")) {
                foundIt = false;
                break OUTERLOOP;
            } else if (playerGuess.equals("MILK")) {
                foundIt = false;
                break OUTERLOOP;
            } else if (playerGuess.equals("TEA")) {
                foundIt = false;
                break OUTERLOOP;
            } else if (playerGuess.equals("WATER")) {
                foundIt = false;
                break OUTERLOOP;
            } else {
                System.out.println("Oh no,wrong answer " + i + " lives left!");
                foundIt = true;
                if (i == 0){
                    System.out.println("GAME OVER");

                    switch (randomInt){
                        case 1 -> System.out.println("You fucking donkey,the correct answer was 'APPLE'!");
                        case 2 -> System.out.println("You fucking donkey,the correct answer was 'BUTTON'!");
                        case 3 -> System.out.println("You fucking donkey,the correct answer was 'JEANS'!");
                        case 4 -> System.out.println("You fucking donkey,the correct answer was 'BOOTS'!");
                        case 5 -> System.out.println("You fucking donkey,the correct answer was 'DRINK'!");
                        case 6 -> System.out.println("You fucking donkey,the correct answer was 'JAVA'!");
                        case 7 -> System.out.println("You fucking donkey,the correct answer was 'CHOCOLATE'!");
                        case 8 -> System.out.println("You fucking donkey,the correct answer was 'MILK'!");
                        case 9 -> System.out.println("You fucking donkey,the correct answer was 'TEA'!");
                        case 10 -> System.out.println("You fucking donkey,the correct answer was 'WATER'!");
                    }
                    System.exit(0);
            }
        }

            }
            System.out.println("Correct answer!");
            }
        }





