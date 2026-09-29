import java.util.Scanner;

public class Day2_RSP_with_CP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Scissors, Rock, Paper 중 하나를 입력하세요: ");
        String userInput = scan.nextLine().trim();
        int randomNum  = (int) (Math.random() * 3 + 1);
        if (randomNum == 1) {
            System.out.println("컴퓨터: Scissors");
        } else if (randomNum == 2) {
            System.out.println("컴퓨터: Rock");
        } else {
            System.out.println("컴퓨터: Paper");
        }
        if (userInput.equals("Scissors")) {
            if (randomNum == 1) {
                System.out.println("비겼습니다.");
            } else if (randomNum == 2) {
                System.out.println("졌습니다.");
            } else {
                System.out.println("이겼습니다.");
            }
        } else if (userInput.equals("Rock")) {
            if (randomNum == 1) {
                System.out.println("이겼습니다.");
            } else if (randomNum == 2) {
                System.out.println("비겼습니다.");
            } else {
                System.out.println("졌습니다.");
            }
        } else if (userInput.equals("Paper")) {
            if (randomNum == 1) {
                System.out.println("졌습니다.");
            } else if (randomNum == 2) {
                System.out.println("이겼습니다.");
            } else {
                System.out.println("비겼습니다.");
            }
        } else {
            System.out.println("잘못된 입력입니다. Scissors, Rock, Paper 중 하나를 입력하세요.");
        }
    }
}
