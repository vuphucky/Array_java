package Array_java;

import java.util.Arrays;
import java.util.Scanner;

public class find_max_arr {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("enter size");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("size must be less than 20");
            }
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter element" + i + "; ");
            array[i] = sc.nextInt();
        }
        System.out.println("array: " + Arrays.toString(array));

        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
                index = i;
            }
        }
        System.out.println(" the max element in the list is: " + max + ", at position: " + index);
    }
}
