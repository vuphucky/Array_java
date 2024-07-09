package Array_java;

import java.util.Arrays;
import java.util.Scanner;

public class maxInTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Cols");
        int cols = sc.nextInt();
        System.out.println("enter Rows");
        int rows = sc.nextInt();

        int [][] arr = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.println("enter element " + i + j + ":");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Two dimensional arr: " + Arrays.deepToString(arr));
        System.out.println("max element in array = " + maxInArray(arr));
    }

    public static int maxInArray(int [][] arr){
        int max = arr[0][0];
        for (int i = 1; i < arr.length ; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (max < arr[i][j]) {
                    arr[i][j] = max;
                }
            }
        }
        return max;
    }
}
