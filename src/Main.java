import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");

        String str = scanner.nextLine();

        if(Objects.equals(str, strreverse(str))) System.out.println("It is a palindrome.");
        else System.out.println("This is not a palindrome.");
    }

    public static String strreverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}