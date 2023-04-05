import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int z = dados.nextInt();
        System.out.println("Você digitou o número " + z);
        dados.nextLine();
        System.out.println("Digite outro número: ");
        int y = dados.nextInt();
        System.out.println("Você digitou o número " + y);
        dados.nextLine();
        System.out.println("A soma entre " + z + " e " + y + " é " + (z + y) + "!");
        System.out.println("A subtração entre " + z + " e " + y + " é " + (z - y) + "!");
        System.out.println("A divisão entre " + z + " e " + y + " é " + (z / y) + "!");
        System.out.println("A multiplicação entre " + z + " e " + y + " é " + (z * y) + "!");
    }
}
