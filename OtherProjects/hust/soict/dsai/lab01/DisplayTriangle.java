package OtherProjects.hust.soict.dsai.lab01;

import java.util.Scanner;

public class DisplayTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        System.out.println("");

        for (int i = 1; i < n+1; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println("");
            // for (int k = )
        }

        sc.close();
    }
}

/*

     *
    ***
   *****
  *******
 *********
*********** 

n = 5
 */
