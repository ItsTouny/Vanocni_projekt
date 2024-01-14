public class MyBigInteger {

    private  long myBigInteger;

    public long getMyBigInteger() {
        return  myBigInteger;
    }

    public MyBigInteger(long myBigInteger) {
        this.myBigInteger = myBigInteger;
    }

    public MyBigInteger() {
    }

    /**
     *multiplies 2 numbers together
     * @param number
     * @return product of 2 numbers
     *
     */
    public  MyBigInteger multiply(MyBigInteger number){
        MyBigInteger myBigInteger1 = new MyBigInteger(myBigInteger* number.getMyBigInteger());
        return myBigInteger1;
    }

    /**
     * creates myBigInteger with number 1
     * @return number 1
     */
    public  MyBigInteger ONE(){
        MyBigInteger myBigInteger1 = new MyBigInteger(1);
        return myBigInteger1;
    }

    /**
     * adds 2 numbers together
     * @param number
     * @return sum of numbers
     */
    public MyBigInteger add(long number){
        MyBigInteger myBigInteger1 = new MyBigInteger(myBigInteger+number);
        return myBigInteger1;
    }

    /**
     * creates myBigInteger with -1
     * @return number -1
     */
    public MyBigInteger ONEminus(){
        MyBigInteger myBigInteger1 = new MyBigInteger(-1);
        return myBigInteger1;
    }


    @Override
    public String toString() {
        return ""+myBigInteger;

    }
}

