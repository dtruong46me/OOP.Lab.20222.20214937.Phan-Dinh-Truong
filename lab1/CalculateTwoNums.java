package lab1;

import javax.swing.JOptionPane;

public class CalculateTwoNums {
    public static void main(String[] args) {
        String strNum1, strNum2;
        double sum, diff, prod, quot;
        String msg1, msg2;

        strNum1 = JOptionPane.showInputDialog(null,
            "Enter the first number: ", "Input the first number",JOptionPane.INFORMATION_MESSAGE);

        strNum2 = JOptionPane.showInputDialog(null,
            "Enter the first number: ", "Input the first number",JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        
        if (num2 == 0) {
            sum = num1 + num2;
            diff = num1 - num2;
            prod = num1 * num2;
            msg2 = "Sum = " + sum + "\n" + 
                "Difference = " + diff + "\n" + 
                "Product = " + prod + "\n" + 
                "The division equals to 0";

                JOptionPane.showMessageDialog(null, msg2, 
                "Calculate two numbers", JOptionPane.INFORMATION_MESSAGE);
    
        } else {
            sum = num1 + num2;
            diff = num1 - num2;
            prod = num1 * num2;
            quot = num1 / num2;
    
            msg1 = "Sum = " + sum + "\n" +
                "Difference = " + diff + "\n" +
                "Product = " + prod + "\n" + 
                "Quotient = " + quot + "\n";
    
            JOptionPane.showMessageDialog(null, msg1, 
                "Calculate two numbers", JOptionPane.INFORMATION_MESSAGE);
    
        }
        System.exit(0);
    }
}
