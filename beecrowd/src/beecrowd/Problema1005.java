package beecrowd;

public class Problema1005 {
public static void main(String[] args) {
	
//Leia 2 valores de ponto flutuante de dupla precis�o A e B, 
//que correspondem a 2 notas de um aluno. 
//A seguir, calcule a m�dia do aluno, sabendo que a nota A tem peso 3.5 
//e a nota B tem peso 7.5 (A soma dos pesos portanto � 11). 
//Assuma que cada nota pode ir de 0 at� 10.0, sempre com uma casa decimal.

//Entrada
//O arquivo de entrada cont�m 2 valores com uma casa decimal cada um.

//Sa�da
//Imprima a mensagem "MEDIA" e a m�dia do aluno conforme exemplo abaixo, 
//com 5 d�gitos ap�s o ponto decimal e com um espa�o em branco antes e depois da igualdade. 
//Utilize vari�veis de dupla precis�o (double) e como todos os problemas, 
//n�o esque�a de imprimir o fim de linha ap�s o resultado, caso contr�rio, 
//voc� receber� "Presentation Error".
	
double notaA1 = 5.0;
double pesoNotaA1 = (notaA1 * 0.3181818);

double notaA2 = 7.1;
double pesoNotaA2 = (notaA2 * 0.6818181);

double mediaA1 = (pesoNotaA1  + pesoNotaA2); 
System.out.printf(" MEDIA = %.5f \n", mediaA1);



double notaB1 = 0.0;
double pesoNotaB1 = (notaB1 * 0.3181818);

double notaB2 = 7.1;
double pesoNotaB2 = (notaB2 * 0.6818181);

double mediaB2 = (pesoNotaB1  + pesoNotaB2); 
System.out.printf(" MEDIA = %.5f \n", mediaB2);


double notaC1 = 10.0;
double pesoNotaC1 = (notaC1 * 0.3181818);

double notaC2 = 10.0;
double pesoNotaC2 = (notaC2 * 0.6818181);

double mediaC2 = (pesoNotaC1  + pesoNotaC2); 
System.out.printf(" MEDIA = %.5f \n", mediaC2);


}
}
