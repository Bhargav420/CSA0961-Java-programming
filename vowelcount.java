class vowelcount
{
	public static void main(String arg[])
{

	int count=0;
	int i;
	char ch;
	String b="saveethaschoolofengineering";
	for(i=0;i<=26;i++)
	{
	ch=b.charAt(i);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
	count++;
	}
	}
	System.out.println("no of vowels are"+count);
}}
