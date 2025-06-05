package chandu;
import java.util.Scanner;

public class RainUmbrella {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("it is Raining(Yes/No)");
		String answer=sc.next();
		if(answer.equals("Yes")) {
			System.out.println("Take an umbrella");
		}else {
			System.out.println("no need of an umbrella");
		}
		 
        sc.close();
	}

}
