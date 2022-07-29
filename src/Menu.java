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
            System.out.println("Digite 2 para fazer uma subtração.");
            System.out.println("Digite 3 para fazer uma multiplicação.");
            System.out.println("Digite 4 para fazer uma divisão.");
            System.out.println("Digite 5 para calcular a raiz quadrada de um número.");
            System.out.println("Digite 6 para ver o último resultado calculado.");
            System.out.println("Digite 7 para sair.");
            int opcao = perguntaInt("Qual sua opção?");

            switch (opcao) {
                case 1:
                    fazSoma();
                    break;
                case 2:
                    fazSubtracao();
                    break;
                case 3:
                    fazMultiplicacao();
                    break;
                case 4:
                    fazDivisao();
                    break;
                case 5:
                    fazRaiz();
                    break;
                case 6:
                    mostraUltimoResultado();
                    break;
                case 7:
                    continua = false;
            }
        }

        System.out.println("Fim da calculadora.");
    }

    private void fazSoma() {
        int primeiroNumero = perguntaInt("Qual o primeiro número que você deseja somar?");
        int segundoNumero = perguntaInt("Qual o segundo número que você deseja somar?");

        double resultado = calculadora.calculaSoma(primeiroNumero, segundoNumero);

        System.out.println("Sua soma deu " + resultado + ".");
    }

    private void fazSubtracao() {
        int primeiroNumero = perguntaInt("Qual o primeiro número que você deseja subtrair?");
        int segundoNumero = perguntaInt("Qual o segundo número que você deseja subtrair?");

        double resultado = calculadora.calculaSubtracao(primeiroNumero, segundoNumero);

        System.out.println("Sua subtração deu " + resultado + ".");

    }

    private void fazMultiplicacao() {
        int primeiroNumero = perguntaInt("Qual o primeiro número que você deseja multiplicar?");
        int segundoNumero = perguntaInt("Qual o segundo número que você deseja multiplicar?");

        double resultado = calculadora.calculaMultiplicacao(primeiroNumero, segundoNumero);

        System.out.println("Sua multiplicação deu " + resultado + ".");
    }

    private void fazDivisao() {
        int primeiroNumero = perguntaInt("Qual o primeiro número que você deseja dividir?");
        int segundoNumero = perguntaInt("Qual o segundo número que você deseja dividir?");

        if (segundoNumero == 0) {
            System.out.println("O segundo número da operação não pode ser 0.");
        } else {
            double resultado = calculadora.calculaDivisao(primeiroNumero, segundoNumero);

            System.out.println("Sua divisão deu " + resultado + ".");
        }
    }

    private void fazRaiz() {
        int numero = perguntaInt("Qual o número que você deseja calcular a raiz quadrada?");

        if (numero < 0) {
            System.out.println("A raiz quadrada de números negativos não existe.");
        } else {
            double resultado = calculadora.calculaRaiz(numero);

            System.out.println("Sua raiz deu " + resultado + ".");
        }
    }

    private void mostraUltimoResultado() {
        double ultimoResultado = calculadora.getUltimoResultado();

        System.out.println("O último resultado calculado pela calculadora foi " + ultimoResultado + ".");
    }

    private int perguntaInt(String pergunta) {
        System.out.println(pergunta);
        return scanner.nextInt();
    }
}
