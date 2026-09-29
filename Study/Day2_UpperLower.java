import java.util.Scanner;

public class Day2_UpperLower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("영어 문자열을 입력하세요: ");
        String input = scanner.nextLine();
        for(int i =0; i<input.length(); i++) {
            char ch = input.charAt(i);
            int ascii = (int) ch;
            if (ascii > 90) {
                System.out.print((char)(ascii - 32));
            } else {
                System.out.print((char)(ascii + 32));

            }
        }
    }
}