public class Pgrande extends Perros{
    private RazaPgrande raza;

    public Pgrande(String nombre, int edad, String color, int peso, boolean muerde, RazaPgrande raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    public RazaPgrande getRaza() {
        return raza;
    }

    public void setRaza(RazaPgrande raza) {
        this.raza = raza;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Es de raza: "+raza);
    }
}