package section_a_conditionals;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Greater value: " + a);
        } else {
            System.out.println("Greater value: " + b);
        }

        sc.close();
    }
}
