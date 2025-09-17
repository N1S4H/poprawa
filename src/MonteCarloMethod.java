import java.util.Random;

public class MonteCarloMethod extends Integral{
    int n;
    public MonteCarloMethod(CalculatedFunction function, double gorna, double dolna, int n) {
        super(function, gorna, dolna);
        this.n = n;
    }

    @Override
    double Calculte() {
        Random generator = new Random();
        double suma = 0;
        for (int i = 0; i < n; i++) {
            double wylosowana = generator.nextDouble(gorna-dolna) + dolna;
            suma = suma +  function.f(wylosowana);
        }

        double dlugosc = gorna - dolna;
        double wynik = (suma * dlugosc)/n;
        return wynik;
    }
}
