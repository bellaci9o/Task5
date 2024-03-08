import java.math.BigDecimal;

public class Main5 {
    public static void main(String[] args) {

        double someprodukt = 9.99;
        double brutto = 0.23;
        double bruttodouble = someprodukt * (1 + brutto);
        double afterdouble = bruttodouble * 10000;
        double nettodouble = afterdouble / (1 + brutto);
        System.out.println("Using double:");
        System.out.println("Gross value: " + bruttodouble);
        System.out.println("Value after selling 10000pcs: " + afterdouble);
        System.out.println("Net worth of this sum: " + nettodouble);




        BigDecimal netto = new BigDecimal("9.99");
        BigDecimal vatDecimal = new BigDecimal("0.23");
        BigDecimal cenaBruttoDecimal = netto.multiply(BigDecimal.ONE.add(vatDecimal));
        BigDecimal wPSyDecimal = cenaBruttoDecimal.multiply(new BigDecimal("10000"));
        BigDecimal wNettoDec = wPSyDecimal.divide(BigDecimal.ONE.add(vatDecimal), BigDecimal.ROUND_HALF_UP);
        System.out.println("\nUsing BigDecimal:");
        System.out.println("Gross value: " + cenaBruttoDecimal);
        System.out.println("Value after selling 10000pcs: " + wPSyDecimal);
        System.out.println("Net worth of this sum: " + wNettoDec);
    }
}
