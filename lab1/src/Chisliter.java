import java.math.BigInteger;
import java.io.BufferedReader;

public class Chisliter {

    public int readInteger(BufferedReader reader) throws Exception {
        System.out.print("Enter num: ");
        return Integer.valueOf(reader.readLine());
    }

    public boolean isPrime(int number) {
        return BigInteger.valueOf(number).isProbablePrime((int) Math.log(number));
    }

    public void broadcast(int number) {
        for (int i = 0; i < number; i++) {
            if(isPrime(i))
                System.out.println(i);
        }
    }

}