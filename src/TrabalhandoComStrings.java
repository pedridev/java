public class TrabalhandoComStrings {
    public static void main(String[] args) {

        String nome = "Pedro";
        String sobrenome = " Gustavo";

        int tamanhoString = nome.length();
        boolean saoIguais =
                nome.equals(sobrenome);
        nome.concat(sobrenome);
        String nomeCompleto =
                nome.concat(sobrenome);

        System.out.println("Olá " + nome.toLowerCase() + "! " + "seu nome tem " + tamanhoString + " caracteres.");
        System.out.println("Nome completo : " + nomeCompleto);
    }
}
