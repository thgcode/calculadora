public class Calculadora {
    private double ultimoResultado;

    public Calculadora() {
        ultimoResultado = 0;
    }

    public double calculaSoma(int primeiroNumero, int segundoNumero) {
        ultimoResultado = primeiroNumero + segundoNumero;
        return ultimoResultado;
    }

    public double calculaSubtracao(int primeiroNumero, int segundoNumero) {
        ultimoResultado = primeiroNumero - segundoNumero;
        return ultimoResultado;
    }

    public double calculaMultiplicacao(int primeiroNumero, int segundoNumero) {
        ultimoResultado = primeiroNumero * segundoNumero;
        return ultimoResultado;
    }

    public double calculaDivisao(double primeiroNumero, double segundoNumero) {
        if(segundoNumero == 0) {
            System.out.println("O segundo número da ooperação não pode ser 0.");
            ultimoResultado = 0;
        } else {
            ultimoResultado = primeiroNumero / segundoNumero;
        }
        return ultimoResultado;
    }

    public double getUltimoResultado() {
        return ultimoResultado;
    }
}
