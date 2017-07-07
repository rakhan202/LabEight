import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by rizwa on 7/5/2017.
 */
public class LabEight {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to Batting Average Calculator! ");
            String choice = " ";
            do {
                System.out.println("Enter number of times at bat: ");
                int count = sc.nextInt();
                int[] numArray = new int[count];

                double sum = 0;
                sum = getSum(sc, numArray, sum);
                // System.out.println(numArray.length);
                //System.out.println(sum);
                double val = sum / count;
                System.out.printf("\nSlugging percentage: %,.3f", val);
                System.out.println();
                System.out.println("Another batter? (y/n): ");
                choice = sc.next();
            }while (choice.equalsIgnoreCase("y"));
      //  for (int j : numArray) {
         //   System.out.println(j);

      //  }
    }

    public static double getSum(Scanner sc, int[] numArray, double sum) {
        double atBats = 0.0;
        for (int i = 0; i < numArray.length; i++) {
            System.out.println("Result for at-bat: (0-4) " + i + ": ");
            if (!sc.hasNextInt()){
                System.out.println("Error enter number 0-4:");
                sc.next();
            }
            int result = sc.nextInt();
            if(result < 0 || result > 4){
                System.out.println("Error enter number 0-4:");
                sc.next();
            }else if (result >= 0 || result <= 4) {
                numArray[i] = result;
                sum += numArray[i];
                if (result > 0){
                    atBats++;
                }
            }
        }
        //System.out.println("Bats: " + atBats);
        double batAvg = atBats/numArray.length;
        System.out.printf("Batting Average: %,.3f", batAvg);
        return sum;
    }
}
