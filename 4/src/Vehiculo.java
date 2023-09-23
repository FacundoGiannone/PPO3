public abstract class Vehiculo {
    protected int actual;
    protected int max;

    public Vehiculo(int actual, int max) {
        this.actual = actual;
        this.max = max;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public abstract void acelerar(int i);

    public abstract void frenar();

    public abstract void imprimir();

}
