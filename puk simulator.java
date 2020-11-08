import java.util.Scanner;
public class Puk {
	public static void main(String[] args) {
for(int a=1;a<=10;a++){
				System.out.println("Please enter your PUK code to unlock your SIM card");

				int puk;
		Scanner buk=new Scanner(System.in);
		puk=buk.nextInt();
		
			if(puk==12345678){
				System.out.println("You have unlocked your SIM card");
	break;		                     
	                                        	}
					else if(a==10){
				System.out.println('\n'+"Your SIM card is locked"+'\n'+"Please go to the service center searching for help");
		                          	}
					else{
			   System.out.println('\n'+"Error!Try again"+'\n');
				        	}
		}
			}
}