package switchcase;


import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter a Number: ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("sum is: " + sum);

    }
}
