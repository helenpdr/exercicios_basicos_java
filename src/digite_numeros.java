import java.util.Scanner;

public class digite_numeros {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int numero, soma=0;

        do {
            System.out.print("Digite um número. Para finalizar digite 0: ");
            numero = entrada.nextInt();
            soma = soma+numero;
        }while (numero!=0);

        System.out.println("A soma dos números é: " + soma);
    }

}