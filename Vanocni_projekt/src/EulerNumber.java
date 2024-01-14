import java.math.BigDecimal;
import java.math.RoundingMode;
public class EulerNumber {
    /**
     * Calculates Euler number
     * @param scale
     * @return Euler number
     */
    public BigDecimal eulerNumber(int scale){
        Factorial factorial = new Factorial();
        BigDecimal e=BigDecimal.ZERO;
        for (int i=0;i<66;i++){
            MyBigInteger help = new MyBigInteger(i);
            MyBigInteger help1 =factorial.factorial(help);
            BigDecimal help2=new BigDecimal(help1.getMyBigInteger());
            e = BigDecimal.ONE.divide(help2,scale,RoundingMode.CEILING).add(e);
        }
        return e;
    }
}
