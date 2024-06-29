import java.util.Scanner;
class studentuser {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the total number of users: ");
int totalUsers = scanner.nextInt();
System.out.print("Enter the number of staff users: ");
int staffUsers = scanner.nextInt();
int nonTeachingStaffUsers = staffUsers / 3;
int totalStaffUsers = staffUsers + nonTeachingStaffUsers;
int studentUsers = totalUsers - totalStaffUsers;
System.out.println("Student Users: " + studentUsers);
}
}