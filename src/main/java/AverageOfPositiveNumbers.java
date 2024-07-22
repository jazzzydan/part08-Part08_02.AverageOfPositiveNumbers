
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 0) {
                break;
            }
            if (input > 0) {
                sum = sum + input;
                count++;
            }
        }

        if (sum > 0) {
            System.out.println(1.0 * sum / count);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
