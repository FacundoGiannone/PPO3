public class Gpelolargo extends Gatos{
    private RazaGpelolargo raza;

    public Gpelolargo(String nombre, int edad, String color, double asalto, double lsalto, RazaGpelolargo raza) {
        super(nombre, edad, color, asalto, lsalto);
        this.raza = raza;
    }

    public RazaGpelolargo getRaza() {
        return raza;
    }

    public void setRaza(RazaGpelolargo raza) {
        this.raza = raza;
    }
    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Es de raza: "+raza);
    }
}