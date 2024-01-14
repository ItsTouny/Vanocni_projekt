

public class Factorial {
    public Factorial() {
    }

    /**
     * calculates factorial of number n
     * @param n
     * @return number 1
     *         product of n and factorial
     */
    public MyBigInteger factorial(MyBigInteger n) {
        MyBigInteger myBigInteger = new MyBigInteger(n.getMyBigInteger());
        int help =(int) myBigInteger.getMyBigInteger();

        if (n.getMyBigInteger() <= 1) {
            return myBigInteger.ONE();

        }else {
            return myBigInteger.multiply(factorial(myBigInteger.add(-1)));
        }
    }
}
