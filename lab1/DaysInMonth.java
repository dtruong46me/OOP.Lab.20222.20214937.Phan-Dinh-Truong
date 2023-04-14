package lab1;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        String month;
        int year;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month : ");
        month = sc.nextLine();
        System.out.print("Enter the year : ");
        year = sc.nextInt();

        if (year > 0 && Integer.toString(year).length() == 4) {
            switch (month) {
                case "January", "Jan.", "Jan", "1" :
                    System.out.println("31");
                    break;
                
                case "February", "Feb.", "Feb", "2":
                    if (checkLeapYear(year)) {
                        System.out.println("29");
                    } else {
                        System.out.println("28");
                    } break;
                
                case "March", "Mar.", "Mar", "3":
                    System.out.println("31");
                    break;
                
                case "April", "Apr.", "Apr", "4":
                    System.out.println("30");
                    break;
                
                case "May", "May.", "5":
                    System.out.println("31");
                    break;
    
                case "June", "Jun.", "Jun", "6":
                    System.out.println("30");
                    break;
    
                case "July", "Jul.", "Jul", "7":
                    System.out.println("31");
                    break;
                
                case "August", "Aug.", "Aug", "8":
                    System.out.println("31");
                    break;
    
                case "September", "Sep.", "Sep", "9":
                    System.out.println("30");
                    break;
    
                case "October", "Oct.", "Oct", "10":
                    System.out.println("31");
                    break;
                
                case "November", "Nov.", "Nov", "11":
                    System.out.println("30");
                    break;
                
                case "December", "Dec.", "Dec", "12":
                    System.out.println("31");
    
                default:
                    System.out.println("Invalid month!");
                }
        } else {
            System.out.println("Invalid year!");
        }

    sc.close();
    }

    public static boolean checkLeapYear(int year) {
        if ((year%4 == 0 && year%100 != 0) || (year%400 == 0)) {
            return true;
        } else {return false;}
    }
}
