import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número de 1 a 9: ");

        numero = entrada.nextInt();

        int contador=0;

        while (contador<=10){
            System.out.println( numero + " x " + contador + " = " + numero*contador);
            contador++;
        }

        }
    }