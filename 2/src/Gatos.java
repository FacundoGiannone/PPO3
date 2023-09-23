public abstract class Gatos extends Mascota{
    protected double Asalto;
    protected double Lsalto;

    public Gatos(String nombre, int edad, String color, double asalto, double lsalto) {
        super(nombre, edad, color);
        Asalto = asalto;
        Lsalto = lsalto;
    }

    public double getAsalto() {
        return Asalto;
    }

    public void setAsalto(double asalto) {
        Asalto = asalto;
    }

    public double getLsalto() {
        return Lsalto;
    }

    public void setLsalto(double lsalto) {
        Lsalto = lsalto;
    }

    public static void sonido(){
        System.out.println("Los gatos maullan y ronrronean");
    };
    @Override
    public void imprimir() {
        System.out.println("El nombre del gato es: "+nombre+ " es de color "+color+" y tiene "+edad+" años, puede saltar "+Asalto+"m de alto y "+Lsalto+"m de largo");
    }
}