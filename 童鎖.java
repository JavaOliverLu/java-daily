import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		System.out.println("Kids' lock™"+'\n'+"©Math Warrior"+'\n'+"Please enter password to watch the video");
		int pwd;
		Scanner scanner = new Scanner(System.in);
	pwd = scanner.nextInt();
	if(pwd==1111){
		System.out.println("you can watch");
	}
	else{
		System.out.println("wrong");
	}
	}