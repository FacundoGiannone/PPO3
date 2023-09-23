public class Gnopelo extends Gatos{
    private RazaGnopelo raza;

    public Gnopelo(String nombre, int edad, String color, double asalto, double lsalto, RazaGnopelo raza) {
        super(nombre, edad, color, asalto, lsalto);
        this.raza = raza;
    }

    public RazaGnopelo getRaza() {
        return raza;
    }

    public void setRaza(RazaGnopelo raza) {
        this.raza = raza;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Es de raza: "+raza);
    }
}