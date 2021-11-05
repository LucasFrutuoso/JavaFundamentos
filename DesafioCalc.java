package exercicios;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {

    //Calculadora sem utilizar estrutura condicional IF/ELSE.
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Numero:");
    	  double n1 = sc.nextDouble();
    System.out.println("Numero:");
    	  double n2 = sc.nextDouble();
    	
    	System.out.println("Escolha uma operação matemática:");
    	  String operador = sc.next();
    
    	double resultado = "+".equals(operador) ? num1 + num2 : 0;
    	resultado = "-".equals(operador) ? n1 - n2 : resul;
    	resultado = "*".equals(operador) ? n1 * n2 : resul;
    	resultado = "/".equals(operador) ? n1 / n2 : resul;
    	
    	System.out.printf("%.2f %s %.2f = %.2f", n1, operador, n2, resul);
    	
    	sc.close();
	}

}
