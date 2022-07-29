public class Principal {
    public static void main(String []args) {
        Calculadora minhaCalculadora = new Calculadora();
        Menu menu = new Menu(minhaCalculadora);
        menu.mostra();
    }
}
