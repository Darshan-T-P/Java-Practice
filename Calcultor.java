package com.java.project.practice;
import java.util.Scanner;

public class Calcultor extends Operation {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.println("Choose operation:\n1 - Add\n2 - Subtract\n3 - Multiply\n4 - Divide");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                Operation.add(a,b);
                break;
            case 2:
                sub(a,b);
                break;
            case 3:
                mul(a,b);
                break;
            case 4:
                div(a,b);
                break;
            default:
                System.out.println("Invalid option");
        }

        sc.close();
    }
}
