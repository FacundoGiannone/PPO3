public class Ppequeño extends Perros{
    private RazaPpequeño raza;

    public Ppequeño(String nombre, int edad, String color, int peso, boolean muerde, RazaPpequeño raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }

    public RazaPpequeño getRaza() {
        return raza;
    }

    public void setRaza(RazaPpequeño raza) {
        this.raza = raza;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Es de raza: "+raza);
    }
}