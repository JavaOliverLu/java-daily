import java.util.Scanner;
public class Main {
	public static void main(String[] args) {


				double a,b,c;
		Scanner buk=new Scanner(System.in);
		a=buk.nextDouble();
    b=buk.nextDouble();
    c=buk.nextDouble();
		double d=a*0.3+b*0.3+c*0.4;
    if(d>=91.5){
      System.out.println("You have unlocked your SIM card");
    }
    else{
      System.out.println("safe");
    }
    System.out.println(d);
			}
}