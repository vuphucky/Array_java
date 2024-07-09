package Array_java;

import java.util.Arrays;
import java.util.Scanner;

public class minInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size array");
        int size = sc.nextInt();
        int [] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter element " + i + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println("array is:" + Arrays.toString(arr));
         int minInArray = findMin(arr);
         System.out.print("element min in array is: " + minInArray);
    }

    public static int findMin(int [] arr) {
        int min = arr[0];
        for (int  i = 1;  i < arr.length; i ++) {
            if (arr[i] < min){
                arr[i] = min;
            }
        }
        return min;
    }
}
