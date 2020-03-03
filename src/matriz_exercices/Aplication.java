package matriz_exercices;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com o numero de linhas da matriz:");
		int linhas = sc.nextInt();

		System.out.println("Entre com o numero de colunas da matriz");
		int colunas = sc.nextInt();

		int matriz[][] = new int[linhas][colunas];

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.println("Entre com um numero inteiro para preencher a matriz na linha: " + i + "/ coluna: " + j);
				int preenchimento = sc.nextInt();
				matriz[i][j] = preenchimento;
			}
		}
		
		System.out.println("Entre com um numero inteiro para pesquisar na matriz");
		int pesquisa = sc.nextInt();

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				

				if (matriz[i][j] == pesquisa) {
					System.out.println("Posição " + i + "," + j);

					if (i-1 >= 0 && i-1 < linhas) {
						System.out.print("Acima:");
						System.out.println(matriz[i - 1][j]);
					}
					
					if (i+1 >= 0 && i+1 < linhas) {
						System.out.print("Abaixo:");
						System.out.println(matriz[i + 1][j]);
					}

					if (j-1 >= 0 && j-1 < colunas) {
						System.out.print("Esquerda:");
						System.out.println(matriz[i][j - 1]);
					}
					
					if (j+1 >= 0 && j+1 < colunas) {
						System.out.print("Direita?");
						System.out.println(matriz[i][j + 1]);
					}

				}

			}
		}

		sc.close();

	}

}
