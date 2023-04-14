package lab1;

public class SolvingEquation {
    public static void main(String[] args) {
        return;
    }

    // ax + b = 0
    public static void firstDegEquation(double a, double b) {
        if (a == 0) {
            if (b == 0) {System.out.println("Infinite solution!");}
            else {System.out.println("No solution!");}
        } else {
            System.out.println("The equation has 1 solution : " + (-b/a));
        }
    }

    public static void secondDegEquation(double a, double b, double c) {
        if (a == 0) {
            firstDegEquation(b, c);
        } else {
            double delta = b*b - 4*a*c;
            if (delta < 0) {System.out.println("No solution!");}
            else if (delta == 0) {System.out.println("The equation have double solution : "+ (-b/(2*a)));}
            else {System.out.println("The equation have 2 root : "+ ((-b+Math.sqrt(delta))/(2*a)) + 
                            " and "+ ((-b-Math.sqrt(delta))/(2*a)));}
        }        
    }

    public static void twoVariableEquation(double a11, double a12, double a21, double a22) {
        return;
    }   
}
