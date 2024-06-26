package 단계별로풀어보기.문자열;

import java.util.Scanner;

public class B5622_다이얼 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dial = sc.nextLine();

        int count = 0;

        for (int i = 0; i < dial.length(); i++) {
            switch (dial.charAt(i)) {
                case 'A':
                case 'B':
                case 'C':
                    count += 3;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    count += 4;
                    break;

                case 'G':
                case 'H':
                case 'I':
                    count += 5;
                    break;

                case 'J':
                case 'K':
                case 'L':
                    count += 6;
                    break;

                case 'M':
                case 'N':
                case 'O':
                    count += 7;
                    break;

                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                    count += 8;
                    break;

                case 'T':
                case 'U':
                case 'V':
                    count += 9;
                    break;

                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    count += 10;
                    break;
            }
        }
        System.out.println(count);
    }
}
