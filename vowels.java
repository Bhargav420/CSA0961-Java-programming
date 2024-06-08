import java.util.*;
class vowels
{
	public static void main(String arg[])
{
	Scanner sc=new Scanner(System.in);
	int count=0,k;
	int i;
	char ch;
	String b;
	System.out.print("enter the string b");
	b=sc.nextLine();
	for(k=0;k<=6;k++)
{	
	ch=b.charAt(k);
	if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o'|| ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
	count++;
}
}
	System.out.print(count);
}
}