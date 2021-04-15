package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task04 {
	
	public static void main(String[] args) {
		
		Scanner sc;
		int a;
		int b;
		
		int Summa;
		
		sc = new Scanner(System.in);
		
		System.out.println("Введите целое число ");
		a = sc.nextInt();
		
		System.out.println("Введите целое число ");
		b = sc.nextInt();
		
		Summa = a + b;                             
		
		System.out.println("Сумма = " + Summa);
		
	}

}
