public class Main {
    public static void main(String[] args) {
        Novela n = new Novela("hp", "jkr", "fantasy");
        n.setPrecio(200);
        LibrodeTexto l = new LibrodeTexto("geology", "winter", "UNC", "3°1°");
        l.setPrecio(400);
        n.imprimir();
        l.imprimir();
    }

}
