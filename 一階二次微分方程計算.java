import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
float a,b;
		for( int i=0;i<10000;i++){
System.out.println("©math warrior");
		System.out.println("please enter the value a,b,c to know the diffierntial of"+'\n'+"y=ax^2 +bx+ c");
	System.out.println("Please enter value of a, b");			
						Scanner mat=new Scanner(System.in);
		a=mat.nextFloat();
		b=mat.nextFloat();
		System.out.println("The sentence is y="+a+"x^2 "+b+"x +c");
		System.out.println("Its differential is y="+(a/2)+"x +"+b+'\n');
	}
	}
}