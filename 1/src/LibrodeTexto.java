public class LibrodeTexto extends Libro{
    private String facultad;
    private String curso;

    public LibrodeTexto(String titulo, String autor, String facultad, String curso) {
        super(titulo, autor);
        this.facultad = facultad;
        this.curso = curso;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("facultad "+facultad);
        System.out.println("curso "+curso);
    }
}
