public class Day2_fhRNrj {
    public static void main(String[] args) {
        String BP = "블랙핑크";
        System.out.println("원본 문자열 : " + BP);
        System.out.print("뒤집힌 문자열 : ");
        for(int i = BP.length() - 1; i>=0; i--) {
            System.out.print(BP.charAt(i));
        }
    }
}
