import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LagrangeInterpolatedFunction implements CalculatedFunction{
   private LagrangeInterpolation function = new LagrangeInterpolation();
   double[] x;
   double[] y;
    public LagrangeInterpolatedFunction(double[] x, double[] y) {
       this.x=x;
       this.y=y;
    }

    public static LagrangeInterpolatedFunction make(String sciezkaPliku) {
       List<Double> x = new ArrayList<>();
       List<Double> y = new ArrayList<>();

       String separator = ",";
       List<String> wartosci = null;
       try (BufferedReader br = new BufferedReader(new FileReader(sciezkaPliku))) {
           String linia;
           while ((linia = br.readLine()) != null) {
               wartosci = Arrays.asList(linia.split(separator));
               double[] liczby = wartosci.stream().mapToDouble(Double::parseDouble).toArray();
               x.add(liczby[0]);
               y.add(liczby[1]);
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
       double[] X = new double[x.size()];
       double[] Y = new double[y.size()];
       for (int i = 0; i < x.size(); i++) {
           X[i] = x.get(i);
       }
       for (int i = 0; i < y.size(); i++) {
           Y[i] = y.get(i);
       }

       LagrangeInterpolatedFunction obiekt = new LagrangeInterpolatedFunction(X, Y);


       return obiekt;
   }

    @Override
    public double f(double xToCalculate) {
        return function.calc(x, y, xToCalculate);
    }
}
