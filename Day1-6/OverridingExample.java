package chandu;
class Calculater{
	int calculater(int a,int b) {
		return a + b;
	}
	double calculater(double a,double b) {
		return a * b;
	}
	int calculater(int a,int b,int c)  {
		return a*b*c;
	}
}

public class OverridingExample {

	public static void main(String[] args) {
		Calculater c = new Calculater();
		
		System.out.println(c.calculater(12,30));
		System.out.println(c.calculater(12.5,30.6));
		System.out.println(c.calculater(2,3,6));
	}

}
