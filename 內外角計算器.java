import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
for(int ao=1;ao<200;ao++){
	System.out.println("©math warrior");
		System.out.println("Please enter yuanzhou angle to know circle heart angle"+'\n'+"The unit is degrees");
		int m;
		Scanner n=new Scanner(System.in);
		m=n.nextInt();
if(m<180&&m>0){
				System.out.println("When yuanzhou angle is" +m);
		System.out.println("circle heart angle is "+2*m+'\n');}
		else{
			System.out.println("Error!"+'\n'+"Your math is bad ,please study hard"+'\n');}
}
	}
}