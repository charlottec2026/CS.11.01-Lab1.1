import java.util.Scanner;

public class Dateable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter your age as a whole number: ");
        String age = scanner.nextLine();
        int ageAsNum = Integer.parseInt(age);
        int largestAgeDateable = (ageAsNum / 2)+7;
        System.out.println(ageAsNum + "-year-olds should date someone who is at least " + largestAgeDateable + " years old.");

    }
}
