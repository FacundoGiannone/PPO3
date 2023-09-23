public abstract class Perros extends Mascota{
    protected int peso;
    protected boolean muerde;

    public Perros(String nombre, int edad, String color, int peso, boolean muerde) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isMuerde() {
        return muerde;
    }

    public void setMuerde(boolean muerde) {
        this.muerde = muerde;
    }

    public static void sonido(){
        System.out.println("Los perros ladran");
    }

    @Override
    public void imprimir() {
        System.out.println("El nombre del perro es: "+nombre+ " es de color "+color+" y tiene "+edad+" años, pesa "+peso+"kg");
        if (muerde==true){
            System.out.println("Cuidado, este perro muerde");
        }
        else{
            System.out.println("Este perro no muerde");
        }

    }
}

