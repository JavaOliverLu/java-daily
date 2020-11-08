import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	for(int a=0;a<1000;a++){
			
					System.out.println("please enter the mole concentration value of the water solution");
						
								double m;
				Scanner mol=new Scanner(System.in);
			m=mol.nextDouble();
			double n=(Math.log10(m))*-1;
		
				System.out.printf("the chemical water is %.4f mole and its pH value is %.4f",m,n);
				
			System.out.println('\n'+"©math warrior's pH calculater"+'\n');
		}
			
	}
}