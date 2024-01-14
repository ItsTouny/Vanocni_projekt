import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int decimalPlace;
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("How many decimal places would you like to see?(10-99999)");

            decimalPlace = sc.nextInt();
            if (decimalPlace>99999){
                throw new RuntimeException("Number must be lower than 100000");
            } else if (decimalPlace<10) {
                throw new RuntimeException("Number must be greater than 9");
            }
        }catch (InputMismatchException e){
                throw new InputMismatchException("Input must be a number");
        }
        EulerNumber eulerNumber = new EulerNumber();
        System.out.println("e = "+eulerNumber.eulerNumber(decimalPlace));
    }
}