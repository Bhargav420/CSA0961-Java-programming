import java.util.*;
class Eleven implements Runnable{ 
	public void run(){
		Scanner s = new Scanner(System.in);
		int i,n,k=0;
		System.out.print("Enter the Number:");
		n = s.nextInt();
		for(i=2;i<n;i++){
		if(n%i==0){
		k++;
		}
		}
		if(k!=0){
		System.out.println(n+" is NOT a Prime");
		}
		else{
		System.out.println(n+" is a Prime");
		}
	}
}
class soumil{
	public static void main(String arg[]){
		Eleven m = new Eleven();
		Thread t=new Thread(m);
		t.start();
} 
}