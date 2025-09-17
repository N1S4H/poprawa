public abstract class Integral {
    public CalculatedFunction function;
    double gorna;
    double dolna;

    public Integral(CalculatedFunction function, double gorna, double dolna) {
        this.function = function;
        this.gorna = gorna;
        this.dolna = dolna;
    }

   abstract double Calculte();

}
