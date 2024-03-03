import javax.swing.*;
import java.util.Scanner;


public class teste {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor entre 1 e 3 :");

        int valor = entrada.nextInt();
        switch (valor) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            default:
                System.out.println("Número fora do intervalo");
        }
    }
}