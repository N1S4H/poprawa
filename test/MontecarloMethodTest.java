import oracle.jdbc.OracleBlob;

public class MontecarloMethodTest {
    public static void main(String[] args) {
        //obliczenia
        MonteCarloMethod calka = new MonteCarloMethod(new Polynomial(1,2,-8,-1), 4, 0, 16000);

       double wynik = calka.Calculte();
        if (wynik == 39) {
            System.out.println("Implementacja poprawna");
        } else {
            System.out.println("Blad w implementacji - zwrocono " + wynik);
        }
    }
}
