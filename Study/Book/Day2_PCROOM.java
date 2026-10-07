import java.util.Scanner;

public class Day2_PCROOM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("나이를 입력하시오 : ");
        int age = scan.nextInt();
        if (age < 19) {
            System.out.println("미성년자입니다.");
        } else {
            System.out.println("성인입니다.");
        }
    }
}
