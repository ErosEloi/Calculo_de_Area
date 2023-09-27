/* 
 >Exercicio 1< 
 Fazer um programa para ler os valores da largura e altura de um retangulo. Em seguida mostrar na tela o valor de sua área,
 perimetro e diagonal. Usar uma classe como mostrado no projeto ao lado.
 */

package Application;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo rect = new Retangulo();

		System.out.print("Digite o valor da altura: ");
		rect.altura = sc.nextDouble();

		System.out.print("Digite o valor da largura: ");
		rect.largura = sc.nextDouble();

		System.out.printf("área: %.2f / ", rect.area());
		System.out.printf("perimetro: %.2f / ", rect.perimetro());
		System.out.printf("diagonal: %.2f / ", rect.diagonal());

	}

}
