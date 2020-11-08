import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
for(int ao=1;ao<200;ao++){
	System.out.println("©math warrior");
		System.out.println("ax+b=cx+d"+'\n'+"Please enter the values of a, b, c,d");
		double a,b,c,d,f,g,h;
		Scanner n=new Scanner(System.in);
		a=n.nextDouble();
		b=n.nextDouble();
		c=n.nextDouble();
		d=n.nextDouble();
		f=a-c;
		g=d-b;
		h=g/f;
		System.out.println("The values of x is "+h+'\n');	}
	}
}
