/*
 * Демонстрация использования укороченных логических операций 
 * */
package com.mycompany.mavenproject1.tasks;

public class SCops {
	public static void main(String[] args) {
		int n, d;
		
		n = 10;
		d = 2;
		if(d != 0 && (n & d) == 0) {//Укороченная операция предотвращает деnенне на нуnь
			System.out.println(d + " является делителем " + n);
			
			//d = 0;
			if(d != 0 && (n & d) == 0) {
				System.out.println(d + " является делителем " + n);
				
				if(d !=0 & (n & d) == 0) {
					System.out.println(d + " является делителем " + n);
				}
			}
			
		}
	}

}
