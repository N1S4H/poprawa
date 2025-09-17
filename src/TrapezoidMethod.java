public class TrapezoidMethod extends  Integral{
    int n;
    public TrapezoidMethod(CalculatedFunction function, double gorna, double dolna, int n) {
        super(function, gorna, dolna);
        this.n = n;
    }

    @Override
    double Calculte() {
        double szerokoscodcinka;
        szerokoscodcinka = (gorna - dolna)/n;

        for (int i = 0; i < n; i++) {


        }

        return 0;
    }
}
