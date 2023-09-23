public class Main {
    public static void main(String[] args){
        Fracción f1= new Fracción(1,2);
        Fracción f2= new Fracción(1,4);
        Fracción f3= new Fracción(1,1);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println("Suma");
        f3=f1.sumar(f2);
        System.out.println(f3.toString());
        System.out.println("Resta");
        f3=f1.restar(f2);
        System.out.println(f3.toString());
        System.out.println("Multi");
        f3=f1.multiplicar(f2);
        System.out.println(f3.toString());
        System.out.println("Div");
        f3=f1.dividir(f2);
        System.out.println(f3.toString());
    }
}