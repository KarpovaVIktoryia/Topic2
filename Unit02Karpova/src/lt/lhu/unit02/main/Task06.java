package lt.lhu.unit02.main;

public class Task06 {
	
	public static void main(String[] args) {
		
		double a = 1.5;
		double b = 1.0;
		double c = 0.5;
		double d = 3.0;
		
		double result = (a / c) + (b / d) - ((a * b - c) / (c * d));
		
		System.out.println("Значение выражения равно " + result);
		System.out.println();
		
	}

}
