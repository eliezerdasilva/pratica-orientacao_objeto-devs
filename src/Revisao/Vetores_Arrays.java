package Revisao;

public class Vetores_Arrays {

	public static void main(String[] args) {
		double  [] temperaturas = new double [356];
		
		temperaturas[0] = 31.3;
		temperaturas[1] = 34.5;
		temperaturas[2] = 35.6;
		temperaturas[3] = 32.7;
		temperaturas[4] = 33.8;
		temperaturas[5] = 31.3;
		
		System.out.println("Tamanho do array "+ temperaturas.length);
		
		for (int i = 0; i < temperaturas.length; i++) {
		
			System.out.printf("dia "+ i+ temperaturas[i]);
			
		} 
		for (double temp : temperaturas) {
			System.out.println(temp);
			if(temp == 0) {
				break;
			}
		}
	}

}
