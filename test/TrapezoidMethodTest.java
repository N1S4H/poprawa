public class TrapezoidMethodTest {
    public static void main(String[] args) {
        //obliczenia
        TrapezoidMethod calka = new TrapezoidMethod(new Polynomial(1,2,-8,-1), 4, 0, 16);

       double wynik = calka.Calculte();
        if (wynik == 39) {
            System.out.println("Implementacja poprawna");
        } else {
            System.out.println("Blad w implementacji - zwrocono " + wynik);
        }
    }
}
