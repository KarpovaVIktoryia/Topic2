package lt.lhu.unit02.main;

public class Task02 {
	
	public static void main(String[] args) {
	
		int a = 3;
		int b = 5;
		
		System.out.println("Площадь прямоугольного треугольника с катетами " + a + " и " + b + " равна " + (a*b)/2);
		
		double c = Math.sqrt( a*a+b*b );
		
		System.out.println("Гипотенуза прямоугольного треугольника с катетами " + a + " и " + b + " равна " + (float) c );
		
	}

}
