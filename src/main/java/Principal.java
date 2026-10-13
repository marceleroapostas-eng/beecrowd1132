
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int x = leitor.nextInt();
        int y = leitor.nextInt();

        int maior = Math.max(x, y);
        int menor = Math.min(x, y);
        int soma = 0;

        for (int i = menor; i < maior; i++) {
            if (i % 13 != 0) {
                soma += i;
            }
        }
        System.out.println(soma);

        leitor.close();
    }
}
