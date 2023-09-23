public class Gpelocorto extends Gatos{
    private RazaGpelocorto raza;

    public Gpelocorto(String nombre, int edad, String color, double asalto, double lsalto, RazaGpelocorto raza) {
        super(nombre, edad, color, asalto, lsalto);
        this.raza = raza;
    }

    public RazaGpelocorto getRaza() {
        return raza;
    }

    public void setRaza(RazaGpelocorto raza) {
        this.raza = raza;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Es de raza: "+raza);
    }

}