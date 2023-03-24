import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner eded = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = eded.nextInt();
            if (number < 20) {
                sum += number;
            }
        }
        System.out.println("20-den kicik ededlerin cemi: " + sum);
    }
}
