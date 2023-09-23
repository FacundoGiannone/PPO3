public class Novela extends Libro {
    private String tipo;

    public Novela(String titulo, String autor, String tipo) {
        super(titulo, autor);
        this.tipo = tipo;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("tipo "+tipo);
    }

}
