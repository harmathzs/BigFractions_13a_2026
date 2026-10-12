public class BigFractions {
    public static boolean isAlessthanB(BigFraction a, BigFraction b) {
        int result = a.toBigDecimal().compareTo(b.toBigDecimal());
        return result < 0; // TODO - common denominator check
    }

    public static boolean equals(BigFraction a, BigFraction b) {
        return a.equals(b);
    }

    public static boolean isAlessthanOrEqualB(BigFraction a, BigFraction b) {
        return equals(a, b) || isAlessthanB(a, b);
    }

    public static boolean isAgreaterthanB(BigFraction a, BigFraction b) {
        return !isAlessthanOrEqualB(a, b);
    }

    public static boolean isAgreaterthanOrEqualB(BigFraction a, BigFraction b) {
        return equals(a, b) || isAgreaterthanB(a, b);
    }

    public static boolean notEquals(BigFraction a, BigFraction b) {
        return !equals(a, b);
    }
}
