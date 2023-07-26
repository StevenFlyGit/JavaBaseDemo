package 算法;

import java.util.Scanner;



public class SameString {

    public static void main(String[] args) {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
        "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String input = sc.nextLine();

        for (int length = input.length() - 1; length >= 0; length--) {
            boolean check = false;
            for (int i = 0; i < alphabet.length; i++) {
                if (alphabet[i].equals(input.charAt(length))) {
                    check = true;
                }
                if (check) {
                    String substring = input.substring(0, length + 1) + alphabet[i];
                    if (!stringBackSame(substring)) {
                        System.out.println(substring);
                        return;
                    }
                }
            }
        }

        System.out.println("NO");


    }


    public static Boolean stringBackSame(String oldString) {
        StringBuilder sb = new StringBuilder();

        for (int length = oldString.length() - 1; length >= 0; length--) {
            sb.append(oldString.charAt(length));
        }

        if (oldString != null && oldString.equals(sb.toString())) {
            return true;
        }

        return false;
    }

}
