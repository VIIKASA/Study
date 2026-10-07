import java.util.Scanner;
public class Day1_Delivery {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int weight;
        String name, address;

        System.out.print("이름을 입력하세요: ");
        name = scanner.nextLine();
        System.out.print("주소를 입력하세요: ");
        address = scanner.nextLine();
        System.out.print("무게(g)를 입력하세요: ");
        weight = scanner.nextInt();

        System.out.println("이름: " + name);
        System.out.println("주소: " + address);
        System.out.println("무게: " + weight*5 + "원");
    }
}
