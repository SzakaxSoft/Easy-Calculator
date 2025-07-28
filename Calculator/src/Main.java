import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Calculator");

        Scanner numInput = new Scanner(System.in);

        System.out.print("Enter your num1: ");
        double num = numInput.nextDouble();


        Scanner num1Input = new Scanner(System.in);
        System.out.print("Enter your num2: ");
        double num1 = num1Input.nextDouble();

        System.out.println("Your numbers are: " + num + " and " + num1);

        System.out.println("Choice a task");
        System.out.println("1) + ");
        System.out.println("2) - ");
        System.out.println("3) / ");
        System.out.println("4) Abs ");
        System.out.println("5) Power ");
        System.out.println("6) Sqr ");
        System.out.println("7) Round ");
        System.out.println("8) Ceiling ");
        System.out.println("9) Floor ");
        System.out.println("10) Max ");
        System.out.println("11) Min ");

        Scanner numEnter = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num2 = numEnter.nextInt();

        if (num2 == 1) {
            System.out.println(num + num1);
            System.out.println(num1 + num);
        } else if (num2 == 2) {
            System.out.println(num - num1);
            System.out.println(num1 - num);
        } else if (num2 == 3) {
            System.out.println(num / num1);
            System.out.println(num1 / num);
        } else if (num2 == 4) {
            double result = Math.abs(num);
            double result1 = Math.abs(num1);
            System.out.println(result);
            System.out.println(result1);
        } else if (num2 == 5) {
            double result2 = Math.pow(num, num1);
            double result3 = Math.pow(num1, num);
            System.out.println(result2);
            System.out.println(result3);
        } else if (num2 == 6) {
            double result4 = Math.sqrt(num);
            double result5 = Math.sqrt(num1);
            System.out.println(result4);
            System.out.println(result5);
        } else if (num2 == 7) {
            double result6 = Math.round(num);
            double result7 = Math.round(num1);
            System.out.println(result6);
            System.out.println(result7);
        } else if (num2 == 8) {
            double result8 = Math.ceil(num);
            double result9 = Math.ceil(num1);
            System.out.println(result8);
            System.out.println(result9);
        } else if (num2 == 9) {
            double result10 = Math.floor(num);
            double result11 = Math.floor(num1);
            System.out.println(result10);
            System.out.println(result11);
        } else if (num2 == 10) {
            double result12 = Math.max(num, num1);
            double result13 = Math.max(num1, num);
            System.out.println(result12);
            System.out.println(result13);
        } else if (num2 == 11) {
            double result14 = Math.min(num, num1);
            double result15 = Math.min(num1, num);
            System.out.println(result14);
            System.out.println(result15);
        } else {
            System.out.println("Please enter valid number! Try Again!");
        }
    }
}
