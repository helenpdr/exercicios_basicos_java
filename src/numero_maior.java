import java.util.Scanner;

public class numero_maior {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número:");

        int numeroUm = entrada.nextInt();

        System.out.println("Digite outro número:");

        int numeroDois = entrada.nextInt();

        if (numeroUm > numeroDois) {
            System.out.println(numeroUm + " é maior que " + numeroDois);
        } else if (numeroUm < numeroDois){
            System.out.println(numeroDois + " é maior que " + numeroUm);
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}