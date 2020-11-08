import java.util.Scanner;
class HaramExp extends Exception{
	public HaramExp(String errMsg){
		super(errMsg);
	}
}
class Halal{
	public boolean yn;
	public void yn(boolean yn){
		try{
			if(yn==true){
				throw new HaramExp("You can not take any thing that associates pig to JAVA");
			}
		}
		catch (HaramExp e){
			e.printStackTrace();
		}
	}
}


public class JavaCustomers {
	public static void main(String[] args) {
for(int ao=1;ao<200;ao++){
	System.out.println("©Custom service of JAVA Island");
		System.out.print("Do you posses any thing with pig to JAVA?(Answer true or false):");
		boolean a;
		Scanner n=new Scanner(System.in);
		a=n.nextBoolean();
		Halal h=new Halal();
		h.yn(a);
		
			}
	}
}