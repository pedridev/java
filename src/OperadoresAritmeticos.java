public class OperadoresAritmeticos {

    public static void main(String[] args){
        double pao = 10.50;
        double queijo = 7.00;
        double peitoDePeru = 8.00;
        double acucar = 1.00;
        double desconto = 5;

        int totalDeDiasDoMes = 30;

        double valorTotal = pao + queijo + peitoDePeru + acucar;

        double valorTotalComDesconto = valorTotal - desconto;
        double valorTotalMensal = valorTotalComDesconto * totalDeDiasDoMes;

        System.out.println("Valor Total = R$" + valorTotalMensal);

    }

}