import java.util.Scanner;
import java.text.DecimalFormat;

public class notas_array {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int[] notas = new int[3];

        double media;

       // DecimalFormat deci = new DecimalFormat("0.00");

        for (int i = 0; i<notas.length; i++) {
            System.out.println("Digite uma nota: ");
            notas[i] = entrada.nextInt();
        }
        double soma = 0;
        for (int i=0; i< notas.length; i++) {
            System.out.println(i+1 + "º nota: " + notas[i]);
            soma += notas[i];
        }
        double mediaNotas = soma/notas.length;
        System.out.printf("A média é: " + "%.2f\n ", mediaNotas);

    }
}