import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        int number ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Inter The Number ");
        number=scan.nextInt();

            if (number % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else if (number % 3 == 0)
            {
                System.out.println("Fizz");
            }else {
                System.out.println(number);
            }
    }
}

