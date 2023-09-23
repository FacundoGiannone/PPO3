public class Acuatico extends Vehiculo implements Vela {
    protected int cPasajeros;
    protected Tipo tipo;

    public Acuatico(int actual, int max, int cPasajeros, Tipo tipo) {
        super(actual, max);
        this.cPasajeros = cPasajeros;
        this.tipo = tipo;
    }

    public int getcPasajeros() {
        return cPasajeros;
    }

    public void setcPasajeros(int cPasajeros) {
        this.cPasajeros = cPasajeros;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
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
        System.out.println("Vehiculo terrestre "+tipo+" de "+cPasajeros+" pasajeros."    );
        System.out.println("Velocidad max: "+max+" actual: "+actual);

    }


    @Override
    public void recomendarVelocidad(int velocidadViento) {
        if (velocidadViento>80){
            System.out.println("Se recomienda no salir a navegar");
            actual=0;
            System.out.println("Vel actual "+actual);
        }else{
            if(velocidadViento<10){
                System.out.println("Se recomienda no salir a navegar");
                System.out.println("Vel actual "+actual);

            }else {
                System.out.println("Se puede navegar");
            }
        }

    }
}
