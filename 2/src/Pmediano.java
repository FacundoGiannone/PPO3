public class Pmediano extends Perros{
    private RazaPmediano raza;

    public Pmediano(String nombre, int edad, String color, int peso, boolean muerde, RazaPmediano raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    public RazaPmediano getRaza() {
        return raza;
    }

    public void setRaza(RazaPmediano raza) {
        this.raza = raza;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Es de raza: "+raza);
    }
}