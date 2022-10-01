package beecrowd;

public class Problema1007 {
public static void main(String[] args) {
	
//Leia quatro valores inteiros A, B, C e D. A seguir, 
//calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo
//a fórmula: DIFERENCA = (A * B - C * D).

//Entrada
//O arquivo de entrada contém 4 valores inteiros.

//Saída
//Imprima a mensagem DIFERENCA com todas as letras maiúsculas, conforme exemplo abaixo, 
//com um espaço em branco antes e depois da igualdade.
	
	//ENTRADA1
	
	int a1 = 5;
	int b1 = 6;
	int c1 = 7;
	int d1 = 8;
	
	int dif1 = (a1*b1) - (c1*d1);
	
	System.out.println("DIFERENCA = " + dif1);
	
	//ENTRADA2
	
	int a2 = 0;
	int b2 = 0;
	int c2 = 7;
	int d2 = 8;
		
	int dif2 = (a2*b2) - (c2*d2);
		
	System.out.println("DIFERENCA = " + dif2);
	
	//ENTRADA3
	
	int a3 = 5;
	int b3 = 6;
	int c3 = -7;
	int d3 = 8;
		
	int dif3 = (a3*b3) - (c3*d3);
		
	System.out.println("DIFERENCA = " + dif3);
	
}
	
}
