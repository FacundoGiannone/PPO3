public class Main {
    public static void main(String[] args) {
        Terrestre t1=new Terrestre(100,150,6,Uso.Militar);
        Terrestre t2=new Terrestre(80,200,4,Uso.Civil);

        Acuatico a1= new Acuatico(50,90,20,Tipo.Submarino);
        Acuatico a2= new Acuatico(20,100,5,Tipo.Superficie);

        t1.imprimir();
        t1.acelerar(20);
        t1.imprimir();
        t1.frenar();
        t1.imprimir();
        t1.calcularRevolucionesMotor(20,40);

        a1.imprimir();
        a1.acelerar(50);
        a1.imprimir();
        a1.frenar();
        a1.imprimir();
        a1.recomendarVelocidad(90);

    }
}
