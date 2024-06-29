import java.util.Scanner;
class reversepalindrome {
public static boolean isPalindrome(long number) {
return number == reverse(number);
}
public static long reverse(long number) {
long reverse = 0;
while (number != 0) {
reverse = reverse * 10 + number % 10;
number /= 10;
}
return reverse;
}
public static long reverseAndAdd(long number) {
while (!isPalindrome(number)) {
long reversed = reverse(number);
long sum = number + reversed;
System.out.println(number + " + " + reversed + " = " + sum);
number = sum;
}
return number;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a number: ");
long number = scanner.nextLong();
System.out.println("Starting number: " + number);
long palindrome = reverseAndAdd(number);
System.out.println("Palindrome: " + palindrome);
   }
}