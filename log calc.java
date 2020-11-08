import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
for(int ao=1;ao<200;ao++){
	System.out.println("©math warrior");
		System.out.println("Log(a)"+'\n'+"Please enter the values of a");
		double a,b;
		Scanner n=new Scanner(System.in);
		a=n.nextDouble();
		b=Math.log10(a);
		System.out.println("The values of Log "+a+" is "+b+'\n');	}
	}
}