import java.util.Scanner;

public class tabuada_if {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número de 1 a 9: ");

        numero = entrada.nextInt();

        int contador=0;

        if (numero==0 || numero>=10){
            System.out.println("Número inválido!");
        } else {
            while (contador <= 10) {
                System.out.println(numero + " x " + contador + " = " + numero * contador);
                contador++;
            }
        }

    }
}