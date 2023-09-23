public class Terrestre extends Vehiculo implements Motor {
    protected int cRuedas;
    protected Uso uso;

    public Terrestre(int actual, int max, int cRuedas, Uso uso) {
        super(actual, max);
        this.cRuedas = cRuedas;
        this.uso = uso;
    }

    public int getcRuedas() {
        return cRuedas;
    }

    public void setcRuedas(int cRuedas) {
        this.cRuedas = cRuedas;
    }

    public Uso getUso() {
        return uso;
    }

    public void setUso(Uso uso) {
        this.uso = uso;
    }

    @Override
    public void acelerar(int incrementoVelocidad) {
        if (actual + incrementoVelocidad < max) {

            /* Si el incremento de velocidad no supera la velocidad máxima */
            actual = actual + incrementoVelocidad;

        } else {
            /* De otra manera no se puede incrementar la velocidad y se genera mensaje */
            actual=max;
            System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil.");
        }
    }

    @Override
    public void frenar() {
        actual=0;

    }

    @Override
    public void imprimir() {
        System.out.println("Vehiculo terrestre "+uso+" de "+cRuedas+" ruedas."    );
        System.out.println("Velocidad max: "+max+" actual: "+actual);

    }

    @Override
    public void calcularRevolucionesMotor(int fuerza, int radio) {
        System.out.println("Las revoluciones son "+(fuerza*radio));

    }
}
