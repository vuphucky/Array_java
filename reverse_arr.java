package Array_java;

import java.util.Scanner;

public interface reverse_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        int [] array;
        do {
            System.out.println("enter a size ");
            size = sc.nextInt();
            if (size > 20 ) {
                System.out.println("size do not exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        int i =0;
        while (i < array.length){
            System.out.println("enter element " + (i+1) + ": " );
            array[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "element in array: ","" );
        for (int j = 0; j <  array.length ; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length /2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
