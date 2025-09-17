import java.util.ArrayList;

public class Polynomial implements CalculatedFunction {
    int a;
    int b;
    int c;
    int d;

    public Polynomial(Integer... numbers) {
        Integer[] numbers1 = numbers;

        ArrayList<Integer> numbers2 = new ArrayList<>();
        for (int i = 0; i < numbers1.length; i++) {
            numbers2.add(numbers1[i]);
        }
        this.a = numbers2.get(0);
      //  this.a = numbers1[0];
        this.b = numbers2.get(1);
        this.c = numbers2.get(2);
        this.d = numbers2.get(3);
    }

    @Override
    public double f(double x) {
        return a*Math.pow(x,3)+b*Math.pow(x,2)+c*x+d;
    }
}
