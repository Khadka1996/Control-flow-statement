import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = scanner.next().toLowerCase().charAt(0);

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(c + " is a vowel.");
                break;
            default:
                System.out.println(c + " is not a vowel.");
        }
    }
}
