import java.math.BigInteger;

public class BigFraction {
    private BigInteger numerator;
    private BigInteger denominator;

    public BigInteger getNumerator() {
        return numerator;
    }

    public void setNumerator(BigInteger numerator) {
        this.numerator = numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }

    public void setDenominator(BigInteger denominator) {
        this.denominator = denominator;
    }



    public BigFraction() {
        setNumerator(new BigInteger("0"));
        setDenominator(new BigInteger("1"));
    }
    public BigFraction(String numeratorStr, String denominatorStr) {
        setNumerator(new BigInteger(numeratorStr));
        setDenominator(new BigInteger(denominatorStr));
    }
    public BigFraction(long numerator, long denominator) {
        setNumerator(BigInteger.valueOf(numerator));
        setDenominator(BigInteger.valueOf(denominator));
    }
    public BigFraction(int numerator, int denominator) {
        setNumerator(BigInteger.valueOf(numerator));
        setDenominator(BigInteger.valueOf(denominator));
    }
    public BigFraction(BigInteger numerator, BigInteger denominator) {
        setNumerator(numerator);
        setDenominator(denominator);
    }
}
