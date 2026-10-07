public class Day2_FinalExam {
        public static void main(String[] args) {
            int java = 3, mobile = 2, excel = 1;
            double A = 4.5, A0 = 4.0, B = 3.5;

            double avg = ((java * B + mobile * A0 + excel * A)/(java + mobile + excel));
            System.out.println("Average: " + avg);
        }
}
