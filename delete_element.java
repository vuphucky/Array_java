package Array_java;

import java.util.Arrays;
import java.util.Scanner;

public class delete_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size arr");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter element " + i + ":");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("enter the element delete u want:");
        int element = sc.nextInt();
        boolean eleInArr = true;
        int indexElement;

        for (int i = 0; i < arr.length; i++) {
            if (element != arr[i]) {
                eleInArr = false;
            } else {
                indexElement = i;
                arr[indexElement] = arr[indexElement + 1];
                arr[indexElement + 1] = arr[indexElement + 2];
                arr[indexElement + 2] = 0;
                System.out.println(Arrays.toString(arr));
            }
        }
        if (!eleInArr){
            System.out.println("element not in array");
        }
    }
}
