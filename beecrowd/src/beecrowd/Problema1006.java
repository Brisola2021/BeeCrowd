package beecrowd;

public class Problema1006 {

	public static void main(String[] args) {
		
//Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. 
//A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2,
//a nota B tem peso 3 e a nota C tem peso 5. 
//Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

//Entrada
//O arquivo de entrada contém 3 valores com uma casa decimal, 
//de dupla precisão (double).

//Saída
//Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, 
//com 1 dígito após o ponto decimal e com um espaço em branco antes 
//e depois da igualdade. Assim como todos os problemas, 
//não esqueça de imprimir o fim de linha após o resultado, caso contrário, 
//você receberá "Presentation Error".		
		
		
		//ENTRADA1
		
		double notaA1 = 5.0;
		double pesoNotaA1 = (notaA1 * 0.2);

		double notaB1 = 6.0;
		double pesoNotaB1 = (notaB1 * 0.3);

		double notaC1 = 7.0;
		double pesoNotaC1 = (notaC1 * 0.5);
		
		double mediaA1 = (pesoNotaA1  + pesoNotaB1 + pesoNotaC1); 
		
		System.out.printf(" MEDIA = %.1f \n", mediaA1);
		
		//ENTRADA 2
		
		double notaA2 = 5.0;
		double pesoNotaA2 = (notaA2 * 0.2);

		double notaB2 = 10.0;
		double pesoNotaB2 = (notaB2 * 0.3);

		double notaC2 = 10.0;
		double pesoNotaC2 = (notaC2 * 0.5);
		
		double mediaA2 = (pesoNotaA2  + pesoNotaB2 + pesoNotaC2); 
		
		System.out.printf(" MEDIA = %.1f \n", mediaA2);
		
		//Entrada 3
		
		double notaA3 = 10.0;
		double pesoNotaA3 = (notaA3 * 0.2);

		double notaB3 = 10.0;
		double pesoNotaB3 = (notaB3 * 0.3);

		double notaC3 = 5.0;
		double pesoNotaC3 = (notaC3 * 0.5);
		
		double mediaA3 = (pesoNotaA3  + pesoNotaB3 + pesoNotaC3); 
		
		System.out.printf(" MEDIA = %.1f \n", mediaA3);
		
		
	}
}
