package Array_java;

import java.util.Scanner;

public class count_Char {
    public static int countCharAtString(String str ,char x){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == x) {
                count ++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "hello 3 con sau";
        System.out.println("chuoi de kiem tra: " + str);
        System.out.println("nhap ki tu muon kiem tra");
        char c = sc.next().charAt(0);
        int result = countCharAtString(str,c);
        System.out.println("so ki tu trong chuoi la: " + result);
    }
}
