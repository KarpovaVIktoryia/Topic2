package lt.lhu.unit02.main;

public class Task05 {
	
	public static void main(String[] args) {
		
		double a = 1.0;
        double b = 0.25;
        double c = 4.0;

        double result = (b + Math.sqrt(b*b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.println("Значение выражения равно " + result);
        System.out.println();
	}

}
