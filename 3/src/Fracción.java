public class Fracción extends Numerica {
    public int numerador;
    public int denominador;

    public Fracción(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        String S=("numerador "+numerador+" denominador "+denominador);
        return S;
    }



    @Override
    public boolean equals(Fracción f) {
        if(denominador==f.denominador && numerador==f.numerador){
            return true;
        }else{
            return false;
        }



    }

    @Override
    public Fracción sumar(Fracción f) {
        Fracción r=new Fracción(numerador*f.denominador+denominador*f.numerador,denominador*f.denominador);
       r.simplificar();
        return r;
    }

    @Override
    public Fracción restar(Fracción f) {
        Fracción r=new Fracción((numerador*f.denominador-denominador*f.numerador),(denominador*f.denominador));
        r.simplificar();
        return r;
    }

    @Override
    public Fracción dividir(Fracción f) {
        int a=numerador*f.denominador;
        int b=denominador*f.numerador;
        Fracción r=new Fracción(a,b);
        r.simplificar();
        return r;
    }

    @Override
    public Fracción multiplicar(Fracción f) {
        int a=numerador*f.numerador;
        int b=denominador*f.denominador;
        Fracción r=new Fracción(a,b);
        r.simplificar();
        return r;
    }
    public void simplificar(){
        int a = Math.max(numerador, denominador);
        int b = Math.min(numerador, denominador);
        int resultado = 0;

        do {
            resultado = b;
            b = a % b;
            a = resultado;
        } while (b != 0);

        numerador=numerador/resultado;
        denominador=denominador/resultado;
        System.out.println("res "+resultado);
    }
}
