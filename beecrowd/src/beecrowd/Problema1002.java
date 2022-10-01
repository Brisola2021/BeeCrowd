package beecrowd;

public class Problema1002 {

	public static void main(String[] args) {

//A fórmula para calcular a área de uma circunferência é: area = π . raio2. 
//Considerando para este problema que π = 3.14159:

//- Efetue o cálculo da área, elevando o valor de raio ao quadrado e 
//multiplicando por π.

//Entrada
//	A entrada contém um valor de ponto flutuante (dupla precisão), no caso, 
//a variável raio.

//Saída
//Apresentar a mensagem "A=" seguido pelo valor da variável area, 
//conforme exemplo abaixo, com 4 casas após o ponto decimal. 
//Utilize variáveis de dupla precisão (double). 
//Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, 
//caso contrário, você receberá "Presentation Error".

		double pi = 3.14159;
		double raio = 2.00;
		double raiocalc = (double) Math.pow(raio, 2);
		double area = pi * (raiocalc); 
		System.out.printf("A= %.4f %n", area);
		
		double pi2 = 3.14159;
		double raio2 = 100.64;
		double raiocalc2 = (double) Math.pow(raio2, 2);
		double area2 = pi2 * (raiocalc2); 
		System.out.printf("A= %.4f %n", area2);
		
		double pi3 = 3.14159;
		double raio3 = 150.00;
		double raiocalc3 = (double) Math.pow(raio3, 2);
		double area3 = pi3 * (raiocalc3); 
		System.out.printf("A= %.4f %n", area3);
		
		
		
	}

}
