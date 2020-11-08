import java.util.Scanner;
public class IlmuKimia {
	public static void main(String[] args) {
	for(int a=0;a<1000;a++){
			
					System.out.println("please enter the mole concentration value of the water solution");
						
								double m;
				Scanner mol=new Scanner(System.in);
			m=mol.nextDouble();
			double n=(Math.log10(m))*-1;
		
				System.out.printf("the  water solution is %.4f mole and its pH value is %.4f",m,n);
			
					if(n>7){
					System.out.print(" and the solution is alkaline");
				}
				else if(n<7){
					System.out.print(" and the solution is acid");
					}
					else{
					System.out.print(" and the solution is neutral");
					}
			System.out.println('\n'+"©math warrior's pH calculater"+'\n');
		}
	}
}