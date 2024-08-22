import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int valorAp = 190000;

        System.out.println("Quanto você já pagou no seu apartamento? Escreva o número inteiro sem ponto ou vírgula :");
        Scanner scanner = new Scanner(System.in);

        int respostaValorAp = scanner.nextInt();

        if (respostaValorAp == 95000) {
            System.out.println("Você pagou metade do valor do apartamento!");
        }

        else if (respostaValorAp == 190000) {
            System.out.println("Você já pagou o valor total do apartamento!");
        }

        else if (respostaValorAp < 94000) {
            System.out.println("Você pagou menos da metade do valor total do apartamento!");
        }

        else if(respostaValorAp > 96000){
            System.out.println("Você pagou mais da metade do valor total do apartamento!");
                }


        scanner.close();
    }
}
