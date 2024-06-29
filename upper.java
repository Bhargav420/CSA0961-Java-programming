import java.util.Scanner;
public class upper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u = 0;
        int l = 0;
        int n = 0;
        while (true) {
            System.out.print("Enter any character: ");
            char ch = sc.next().charAt(0);
            if (ch == '*') {
                break;
            }
            if (Character.isUpperCase(ch)) {
                u++;
            } else if (Character.isLowerCase(ch)) {
                l++;
            } else if (Character.isDigit(ch)) {
                n++;
            }
        }
        System.out.println("Total count of lower case: " + l);
        System.out.println("Total count of upper case: " + u);
        System.out.println("Total count of numbers = " + n);
    }
}