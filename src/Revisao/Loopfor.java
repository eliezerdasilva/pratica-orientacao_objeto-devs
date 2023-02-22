package Revisao;

public class Loopfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0, j=10; i< j; i++,j--) {
			System.out.println(i+j);
		}
		int count = 0;
		for( ; count < 5;) {
			System.out.println(count);
			count +=2;
		}
		int soma = 0;
		for(int i = 1 ; i<5;soma += i++);
		
		System.out.println("-----");
		
		for(int i=0; i<=4;i++) {
			rotulo1: {
				rotulo2:{
					rotulo3:{
						if(i== 1) {
							break rotulo1;
						}
						if(i == 2) {
							break rotulo2;
						}
						if(i == 3) {
							break rotulo3;
						}
					System.out.println("Rotulo 3");
					}
					System.out.println("Rotulo 2");
				}
				System.out.println("Rotulo 1");
			}
			System.out.println(i);
		}
		System.out.println("-----");
		for(int i=0; i<=30;i++) {
			if(i % 7 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
