package com.mycompany.mavenproject1;

public class InfinitLoop {
	
	public static void main(String[] args) {
		for (;;) {
			System.out.println("Infinity");
			//остановить бесконечный цикл можно с помощью оператора break
			//break; 
		}
	}
}
