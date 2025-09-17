public class AnyFunction implements CalculatedFunction{
    private CalculatedFunction funkcjadowykonania;

    public AnyFunction(CalculatedFunction funkcja) {
        this.funkcjadowykonania = funkcja;
    }

    @Override
    public double f(double x) {
        return funkcjadowykonania.f(x);
    }

    public static void main(String[] args) {
        AnyFunction sin = new AnyFunction(x -> Math.sin(x)*2);
        AnyFunction cos = new AnyFunction(x -> Math.cos(x)*2);
        AnyFunction sinPodwojny = new AnyFunction(x-> sin.f(x) * cos.f(x));


        System.out.println(sin.f(6));
        System.out.println(sinPodwojny.f(6));
    }
}
