package chandu;
import java.util.ArrayList;

public class ArratListAdvanture {

	public static void main(String[] args) {
		ArrayList<String>Cartoon=new ArrayList<String>();
		Cartoon.add("Dora");
		Cartoon.add("kushi");
		Cartoon.add("Tom");
		Cartoon.add("Jerry");
		Cartoon.add("hydi");
		System.out.println(Cartoon);
		Cartoon.remove(4);
		
		System.out.println(Cartoon);
		Cartoon.set(1,"Ironman");
		System.out.println(Cartoon);
	}

}
