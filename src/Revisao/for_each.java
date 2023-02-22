package Revisao;

import java.util.Iterator;
import java.util.Random;

public class for_each {
	
	public static void main(String[] args) {
		
	int [] notas = new int[10];
	
	Random random = new Random();
	
	for (int i = 0; i < notas.length; i++) {
	notas[i] = random.nextInt(10);
	}
	
	for (int i = 0; i < notas.length; i++) {
		System.out.println(notas[i]);
	}
	
	System.out.println("---");		
	
	for (int nota : notas) {
		System.out.println(nota);
	}
	
	double[][] notasAlunos = new double[2][4];

	notasAlunos[0][0] = 9;
	notasAlunos[0][1] = 9;
	notasAlunos[0][2] = 9;
	notasAlunos[0][3] = 9;
	
	

	notasAlunos[1][0] = 9;
	notasAlunos[1][1] = 9;
	notasAlunos[1][2] = 9;
	notasAlunos[1][3] = 9;
	
	int i = 0;

	for (double[] notasAluno : notasAlunos) {
	
		i++;
		for (double nota : notasAluno) {
			System.out.println("aluno "+ i +" "+ nota);
			
		}
		
	}
	
	}

}
