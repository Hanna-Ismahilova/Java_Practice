package com.mycompany.mavenproject1.tasks;

public class Break5_Mark {
	public static void main(String[] args) {
		
		done:
			for(int i=0; i<10; i++) {
				for(int j=0; j<10; j++) {
					for(int k=0; k<10; k++) {
						System.out.println(k + " ");
						if(k==5) break done;//переход по метке done
					}
					System.out.println("Пocлe цикла по k");//не выполнится 
				}
				System.out.println("Пocлe цикла по j");//не выполнится
			} 
	System.out.println("Пocлe цикла по i");
	}

}
