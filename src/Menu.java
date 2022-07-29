import java.util.Scanner;

public class Menu {
    private Calculadora calculadora;
    private Scanner scanner;

    public Menu(Calculadora calculadora) {
        this.calculadora = calculadora;
        scanner = new Scanner(System.in);
    }

    public void mostra() {
        boolean continua = true;

        while (continua) {
            System.out.println("Menu da calculadora:");
            System.out.println("Digite 1 para fazer uma soma.");
            System.out.println("Digite 2 para ver o último resultado calculado.");
            System.out.println("Digite 3 para sair.");
            int opcao = perguntaInt("Qual sua opção?");

            switch (opcao) {
                case 1:
                    fazSoma();
                    break;
                case 2:
                    mostraUltimoResultado();
                    break;
                case 3:
                    continua = false;
            }
        }

        System.out.println("Fim da calculadora.");
    }

    private void fazSoma() {
        int primeiroNumero = perguntaInt("Qual o primeiro número que você deseja somar?");
        int segundoNumero = perguntaInt("Qual o segundo número que você deseja somar?");

        int resultado = calculadora.calculaSoma(primeiroNumero, segundoNumero);

        System.out.println("Sua soma deu " + resultado + ".");
    }

    private void mostraUltimoResultado() {
        int ultimoResultado = calculadora.getUltimoResultado();

        System.out.println("O último resultado calculado pela calculadora foi " + ultimoResultado + ".");
    }

    private int perguntaInt(String pergunta) {
        System.out.println(pergunta);
        return scanner.nextInt();
    }
}
