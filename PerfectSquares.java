import java.util.Scanner;

public class PerfectSquares 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lower range: ");
        int lower = scanner.nextInt();
        System.out.print("Enter upper range: ");
        int upper = scanner.nextInt();

        System.out.print("Perfect squares in the range are: ");
        for (int i = lower; i <= upper; i++) 
        {
            int sqrt = (int) Math.sqrt(i);
            if (sqrt * sqrt == i)
            {
                int sum = 0;
                int temp = i;
                while (temp > 0)
                {
                    sum += temp % 10;
                    temp /= 10;
                }
                if (sum < 10) 
                {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }
}