import java.util.Scanner;

public class Day2_Dumb {
    public static void main(String[] args) {

        double pound, kg;

        Scanner scanner = new Scanner(System.in);
        System.out.println("파운드 입력");
        pound = scanner.nextDouble();
        System.out.println(pound + "파운드는" + (pound * 0.45359237) + "킬로그램입니다.");
        System.out.println("킬로그램 입력");
        kg = scanner.nextDouble();
        System.out.println(kg + "킬로그램은" + (kg * 2.2046226218) + "파운드입니다.");

    }
}