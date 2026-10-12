import org.junit.Assert;
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

    @Test
    public void testParse() {
        BigFraction a = BigFraction.parse("-2/5");
        // System.out.println(a);
        Assert.assertEquals("(-2/5)", a.toString());
    }

    @Test
    public void testEquals() {
        BigFraction a = BigFraction.parse("-2/5");
        BigFraction b = BigFraction.parse("-2/5");
        // System.out.println(a.equals(b));
        Assert.assertTrue(a.equals(b));
    }

    @Test
    public void testLessthan() {
        BigFraction a = BigFraction.parse("1/3");
        BigFraction b = BigFraction.parse("2/3");
        Assert.assertTrue(BigFractions.isAlessthanB(a, b));
    }
}
