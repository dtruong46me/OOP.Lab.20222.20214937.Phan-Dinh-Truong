package lab1;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();

        int array[] = new int[n];

        // Enter the elements of the array
        System.out.println("Enter the elements of the array : ");
        for (int i = 0; i < n; i++) {
            System.out.print("A["+(i+1)+"] = ");
            array[i] = sc.nextInt();
        }

        System.out.println("Your array before sorting: ");
        for (int j = 0; j < n-1; j++) {
            System.out.print(array[j]+", ");
        }
        System.out.println(array[n-1]);

        // Selection Sort
        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[minIdx]) {minIdx = j;}
            }
            int tmp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = tmp;
        }

        System.out.println("Your array after sorting: ");
        for (int j = 0; j < n-1; j++) {
            System.out.print(array[j]+", ");
        }
        System.out.println(array[n-1]);

        sc.close();
    }
}
