package lt.lhu.unit02.main;

import java.util.*;

public class Task03 {
	
	public static void main(String[] args) {
		
		double a = 1.0;
		double b = 0.3;
		double c = 4.0;
		
		double result = (b +Math.sqrt(b*b +4 * a * c)) / ( 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
	
		System.out.println("Значение выражения равно " + result);
		
		}
	}