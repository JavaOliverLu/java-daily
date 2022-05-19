import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m,n,a;
		System.out.println("please input m ");
		m=sc.nextInt();
		System.out.println("please input n ");
		n=sc.nextInt();
		System.out.println("please input a11 ");
		a=sc.nextInt();
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
		System.out.print(i*(j-1)+0.5*j*(j-1)+0.5*i*(i-1)+a+" ");
	}
	System.out.println(" ");
}}}
