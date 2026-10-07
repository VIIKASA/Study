import java.util.Scanner;
public class Day1_Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result;
        int num1, num2;
        System.out.print("첫 번째 숫자를 입력하세요: ");
        num1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        num2 = scanner.nextInt();
        System.out.println("두 수의 합: " + (num1 + num2));
        System.out.println("두 수의 차: " + (num1 - num2));
        System.out.println("두 수의 곱: " + (num1 * num2));
        System.out.println("두 수의 나눗셈: " + (result = (double) num1 / num2));
        System.out.println("두 수의 나머지: " + (num1 % num2));
    }
}
