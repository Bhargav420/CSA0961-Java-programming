class PrimeNumbers 
{
public static boolean isPrime(int num) 
{
if (num <= 1) 
{
return false;
}
for (int i = 2; i <= Math.sqrt(num); i++) 
{
if (num % i == 0) 
{
return false;
}
}
return true;
}    
public static int findNthPrime(int n) 
{
int count = 0;
int num = 1;
while (count < n) 
{
num++;
if (isPrime(num)) 
{
count++;
}
}
return num;
}
public static void printNextNPrimes(int start, int n) 
{
int count = 0;
int num = start;
while (count < n) 
{
num++;
if (isPrime(num)) 
{
System.out.print(num + " ");
count++;
}
}
System.out.println();
}
public static void main(String[] args) 
{
int N = 5; 
int nthPrime = findNthPrime(N);
System.out.println(N + "rd Prime number is " + nthPrime);
System.out.print(N + " prime numbers after " + nthPrime + " are: ");
printNextNPrimes(nthPrime, N);
}
}