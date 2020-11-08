mport java.util.Scanner;
class TExp extends Exception{
	public TExp(String errMsg){
		super(errMsg);
	}
}
class Grade{
	public double grade;
	public void mygrade(double grade){
		try{
			if(grade<60){
				throw new TExp("You failed xd");
			}
		}
		catch (TExp e){
			e.printStackTrace();
		}
	}
}


public class Main {
	public static void main(String[] args) {
for(int ao=1;ao<200;ao++){
	System.out.println("©math warrior");
		System.out.print("Please enter your grade:");
		double a;
		Scanner n=new Scanner(System.in);
		a=n.nextDouble();
		Grade g=new Grade();
		g.mygrade(a);
		
			}
	}
}