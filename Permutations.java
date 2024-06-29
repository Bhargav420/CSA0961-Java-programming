class Permutations
{
public static void main(String[] args) 
{
calculatePermutations("", "abc");     
}
public static void calculatePermutations(String prefix, String remaining) 
{
if (remaining.length() == 0) 
{
System.out.println(prefix);
} 
else 
{
for (int i = 0; i < remaining.length(); i++) 
{
calculatePermutations(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1));
}
}
}
}