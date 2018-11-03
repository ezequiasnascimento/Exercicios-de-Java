import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		System.out.print("quantas linhas da primeira matriz ? ");
		int l1 = ler.nextInt();
		System.out.print("colunas ? ");
		int c1 = ler.nextInt();
		System.out.print("quantas linhas da segunda matriz ? ");
		int l2 = ler.nextInt();
		System.out.print("colunas ? ");
		int c2 = ler.nextInt();
		int numero;
		int mr[][] = new int[l1][c1];
		if (l1 == c2) {
			int m1[][] = new int[l1][c1];
			int m2[][] = new int[l2][c2];
			System.out.print("Digite os elementos da primeira matriz");
			for (int l = 0; l < l1; l++) {
				for (int c = 0; c < c1; c++) {
					numero = ler.nextInt();
					m1[l][c] = numero;

				}
			}
			
			System.out.print("Digite os elementos da segunda matriz");
			for (int l = 0; l < l1; l++) {
				for (int c = 0; c < c1; c++) {
					numero = ler.nextInt();
					m2[l][c] = numero;

				}
			}
			for(int linha = 0; linha < l1; linha++) {
				int somador = 0;
				for(int coluna = 0;coluna < c2;coluna++)
					for(int k = 0; k < l1;k++) {
						somador = m1[linha][k] *m2[k][coluna];
						mr[linha][coluna] += somador;
					}
			}
			
			System.out.print("O resultado é = ");
			for(int[] i:mr)
				for(int z:i)
					System.out.println(z);
			
			
			
		}
	}
}
