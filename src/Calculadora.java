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
        ultimoResultado = primeiroNumero / segundoNumero;
        return ultimoResultado;
    }

    public double getUltimoResultado() {
        return ultimoResultado;
    }
}
