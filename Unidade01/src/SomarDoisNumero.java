import java.util.*;

public class SomarDoisNumero {
	public static Scanner sc = new Scanner(System.in);
	
	//Main
	public static void main(String[] args){
		
		//Variaveis
		int num1,num2,soma;
		
		//Leitura
		System.out.println("Digite um número");
		num1 = sc.nextInt();
		System.out.println("Digite outro número");
		num2 = sc.nextInt();
		
		//Somar
		soma = num1 + num2;
		
		//Mostrar na tela
		System.out.println("Soma:"+soma);
	}
}
