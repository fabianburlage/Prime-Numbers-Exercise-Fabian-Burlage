import java.util.Scanner;
import java.lang.Math;



public class PrimeNumbersExercise {
    public static void main(String[] args) {

        int numberGivenByUser = 0;
        int squareRootFromGivenNumber = 0;

        do {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite un número desde 5 hasta 300: ");
            numberGivenByUser = scanner.nextInt();
            squareRootFromGivenNumber = (int) Math.sqrt(numberGivenByUser);

            int counter = 2;{

                if (numberGivenByUser % counter == 0 || numberGivenByUser % ++counter == 0 || numberGivenByUser % squareRootFromGivenNumber == 0) {
                    System.out.println(numberGivenByUser + " no es un número primo.");
                } else if (numberGivenByUser % counter != 0 && numberGivenByUser % ++counter != 0 && numberGivenByUser % squareRootFromGivenNumber != 0 ){
                    System.out.println(numberGivenByUser + " es un número primo.");
                }
            }

        } while(numberGivenByUser >= 5 && numberGivenByUser <= 300);


    }
}
