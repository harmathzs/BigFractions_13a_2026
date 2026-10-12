import org.junit.Test;

import java.math.BigInteger;

public class BigFractionTest {
    @Test
    public void testBigFractions() {
        BigFraction a = new BigFraction(); // (0/1) = 0.0
        BigFraction b = new BigFraction("2", "3");
        BigFraction c = new BigFraction(-4L, 5L);
        BigFraction d = new BigFraction(-3, 8);
        BigFraction e = new BigFraction(
                new BigInteger("1"),
                new BigInteger("2")
        );
    }
}
