public class Calculadora {
    private int ultimoResultado;

    public Calculadora() {
        ultimoResultado = 0;
    }

    public int calculaSoma(int primeiroNumero, int segundoNumero) {
        ultimoResultado = primeiroNumero + segundoNumero;
        return ultimoResultado;
    }

    public int calculaSubtracao(int primeiroNumero, int segundoNumero) {
        ultimoResultado = primeiroNumero - segundoNumero;
        return ultimoResultado;
    }

    public int getUltimoResultado() {
        return ultimoResultado;
    }
}
