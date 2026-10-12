public class BigFractions {
    public static boolean isAlessthanB(BigFraction a, BigFraction b) {
        int result = a.toBigDecimal().compareTo(b.toBigDecimal());
        return result < 0; // TODO - common denominator check
    }
}
