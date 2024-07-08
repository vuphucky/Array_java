package Array_java;

import java.util.Scanner;

public class min_element {
    public static int minValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length ; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int [] arr;
        do {
            System.out.println("enter size arr: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("enter size less than 20");
            }
        } while (size > 20);

        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter element" + i + ":");
            arr[i] = sc.nextInt();
        }

        int min = minValue(arr);
        System.out.println("min in the array = " + min);
    }
}
