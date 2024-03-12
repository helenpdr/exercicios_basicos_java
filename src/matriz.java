import java.util.Scanner;

public class matriz {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];


        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                Scanner input = new Scanner(System.in);
                System.out.println("Digite um valor para a matriz: ");
                matriz[linha][coluna] = input.nextInt();

            }

        }
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println("matriz [" + linha + "][" + coluna + "] = " + matriz[linha][coluna]);


            }

        }
    }
}