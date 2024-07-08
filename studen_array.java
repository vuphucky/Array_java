package Array_java;

import java.util.Scanner;

public class studen_array {
    public static void main(String[] args) {
        String [] students = {"tuan", "ky", "long",  "chuyen", "duy"};
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter name student: ");
        String inputName = sc.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("position of the student in the list " + inputName + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("not found " + inputName + " in the list");
        }
    }
}
