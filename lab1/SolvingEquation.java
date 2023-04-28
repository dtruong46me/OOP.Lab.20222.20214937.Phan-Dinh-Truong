package lab1;

import java.util.Scanner;

public class SolvingEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nCHOOSE AN EQUATION TO SOLVE");
        System.out.println("Enter 1: Solve first degree equation");
        System.out.println("Enter 2: Solve second degree equation");
        System.out.println("Enter 3: Solve system of first degree equations");
        System.out.print("Your choice: ");

        String choice = sc.nextLine();

        switch (choice) {
            case "1":
                System.out.println("\n- Solve the equation: ax + b = 0");
                System.out.print("Enter the coefficient a: ");
                double a = sc.nextDouble();
                System.out.print("Enter the coefficient b: ");
                double b = sc.nextDouble();

                solveLinearEquation(a, b);
                break;

            case "2":
                System.out.println("\n- Solve the equation: ax2 + bx + c = 0");
                System.out.print("Enter the coefficient a: ");
                double aa = sc.nextDouble();
                System.out.print("Enter the coefficient b: ");
                double bb = sc.nextDouble();
                System.out.print("Enter the coefficient c: ");
                double cc = sc.nextDouble();

                solveQuadraticEquation(aa, bb, cc);
                break;
            case "3":
                System.out.println("\n- Solve the system of equation: ");
                System.out.println("\ta11*x + a12*y = b1");
                System.out.println("\ta21*x + a22*y = b2");
                System.out.println("Enter the coefficients of the first equation: ");
                System.out.print(" - a11 = ");
                double a11 = sc.nextDouble();
                System.out.print(" - a12 = ");
                double a12 = sc.nextDouble();
                System.out.print(" - b1 = ");
                double b1 = sc.nextDouble();

                System.out.println("Enter the coefficients of the second equation: ");
                System.out.print(" - a21 = ");
                double a21 = sc.nextDouble();
                System.out.print(" - a22 = ");
                double a22 = sc.nextDouble();
                System.out.print(" - b2 = ");
                double b2 = sc.nextDouble();

                solveLinearSystem(a11, a12, a21, a22, b1, b2);
                break;
            default:
                System.out.println("Invalid input!");
        }
        sc.close();
    }

    // ax + b = 0
    public static void solveLinearEquation(double a, double b) {
        if (a == 0) {
            System.out.println("Invalid equation: a cannot be 0!");
            return;
        } else {
            System.out.println("The solution of equation is: " + (-b/a));
        }
    }

    // ax2 + bx + c = 0
    public static void solveQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Invalid equation: a cannot be 0!");
            return;
        }
        double delta = b*b - 4*a*c;

        if (delta < 0) {System.out.println("The equation has no real solution!");}
        else if (delta == 0) {System.out.println("The double root of equation is: "+(-b/(2*a)));}
        else if (delta > 0) {
            double x1 = (-b+Math.sqrt(delta))/(2*a);
            double x2 = (-b-Math.sqrt(delta))/(2*a);
            System.out.println("The equation have 2 solution: "+x1+" and "+x2);
        }
    }

    // a11*x + a12*y = b1
    // a21*x + a22*y = b2
    public static void solveLinearSystem(double a11, double a12, double a21, double a22, double b1, double b2) {
        double D = a11*a22 - a12*a21;
        double D1 = b1*a22 - b2*a12;
        double D2 = a11*b2 - a21*b1;

        if (D == 0) {
            if (D1 == 0 || D2 == 0) {
                System.out.println("The system of equation have infinite solutions!");
            } else {
                System.out.println("The system of equaiton has no solution");
            }
        } else {
            System.out.println("The system of equation has a solution: "+
                    "("+ D1/D + ", " + D2/D + ")");
        }
    }   
}
