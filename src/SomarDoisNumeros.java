import java.util.Scanner;

public class SomarDoisNumeros {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Declaração de variáveis
        int a, b, soma = 0;

        // Solicita ao usuário um primeiro valor
        System.out.println("Digite o primeiro valor");
        a = s.nextInt();

        // Solicita ao usuário um segundo valor
        System.out.println("Digite o segundo valor");
        b = s.nextInt();

        // Realiza a soma de dois valores
        soma = a + b;

        // Printa na tela o valor da soma
        System.out.println("A soma é de " + soma);
        s.close();
    }
}
