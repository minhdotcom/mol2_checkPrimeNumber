import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        int number;
        boolean isPrime = true;

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please input an integer: ");
        number = scanner.nextInt();

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (number <= 2 || isPrime == true) {
            System.out.println(number + " is a Prime number");
        } else {
            System.out.println(number + " is not a Prime number");
        }
    }
}