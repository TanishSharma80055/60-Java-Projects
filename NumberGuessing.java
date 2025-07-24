import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        System.out.println("***************************");
        System.out.println("Random Number Guessing Game");
        System.out.println("***************************");
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int numberToguess = rand.nextInt(100) + 1;
        int number;
        int attempts = 0;
        System.out.println("Guess a number between(1 to 100)");
        do{
           System.out.print("Enter a number: "); 
           number = scanner.nextInt();
           attempts++;
           if(number>numberToguess){
            System.out.println("Number is Too High!");
           } else if (number<numberToguess) {
            System.out.println("Number is Too Low!");
           }
           else{
            System.out.println("******************************************************************");
            System.out.println(" Correct! You guess the correct number in " + attempts + " attempts");
            System.out.println("******************************************************************");
           }
        }
        while(number!=numberToguess);
        scanner.close();
    }
}
