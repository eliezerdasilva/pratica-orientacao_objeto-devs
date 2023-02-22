package Revisao;

/**
 * 
 * @author Eliezer @
 *
 */

public class Matrizes {

	public static void main(String[] args) {
		
		
		double[][] notasAlunos = new double[1][4];

		notasAlunos[0][0] = 9;
		notasAlunos[0][1] = 9;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9;

		for (int i = 0; i < notasAlunos.length; i++) {

			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.println("Aluno" + notasAlunos[i][j]);

			}

		}
		notasAlunos[0][3] = 7;
		
		for (int i = 0; i < notasAlunos.length; i++) {
			double soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				
				soma += notasAlunos[i][j];
			}
			System.out.println("aluno " + i + " nota " + (soma/4));

		}
		System.out.println("---------");
		
		int [][][] matrizTridimencional = new int [3][3][3];
		
		for (int i = 0; i < matrizTridimencional.length; i++) {
			for (int j = 0; j < matrizTridimencional[i].length; j++) {
				for (int k = 0; k < matrizTridimencional[i][j].length; k++) {
					matrizTridimencional[i][j][k] = i + j + k;
					System.out.println("-");	
					
				}
				
			}
			
		}
		int soma = 0, somaImpares = 0, SomaPares = 0;
		for (int i = 0; i < matrizTridimencional.length; i++) {
			for (int j = 0; j < matrizTridimencional[i].length; j++) {
				for (int k = 0; k < matrizTridimencional[i][j].length; k++) {
					soma += matrizTridimencional[i][j][k];
					if(matrizTridimencional[i][j][k] %2 == 0) {
						SomaPares += matrizTridimencional[i][j][k];
						
					}else {
						somaImpares+= matrizTridimencional[i][j][k];
					}
					
				}
				
			}
			
		}

		System.out.println(soma);
		System.out.println(somaImpares);
		System.out.println(SomaPares);
	}

}
