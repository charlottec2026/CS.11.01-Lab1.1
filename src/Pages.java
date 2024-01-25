import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your age as a whole number: ");
        String age = scanner.nextLine();
        int ageAsNum = Integer.parseInt(age);
        if (ageAsNum < 0) {
            System.out.println("Please input a valid number, then try again.");
        }
        if (ageAsNum > 0) {
            int howManyPages = 100-ageAsNum;
            System.out.println(ageAsNum + "-year-olds should read at least " + howManyPages + " pages before giving up on a book.");

        }
    }
}
