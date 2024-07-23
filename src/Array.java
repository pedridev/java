public class Array {
    public static void main(String[] args) {
        // declarando arrays
        // duas formas de declarar arrays

        int [] numeros = {10,20,30,40,50,1};
        String [] frutas;

        frutas = new String[]{"Maçã", "morango", "Abacaxi"};

        double [] salarios = new double[5];
        salarios [3] = 500.00;
        salarios [1] = 200.00;
        salarios [0] = 150.00;
        salarios [2] = 25.00;
        salarios [4] = 100.00;

        // iteração array
        for(int posicao = 0; posicao <salarios.length; posicao++){
            System.out.println(salarios[posicao]);
        }
        for (double salario : salarios){
            System.out.println(salario);
        }
        salarios[2] = 250.00;
        System.out.println(salarios[2]);
    }
}
