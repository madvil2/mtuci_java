import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Palindromer palindromer = new Palindromer();
            palindromer.broadcast(palindromer.isPalindrome(palindromer.readString(reader)) ? "Pol" : "Not pol");

            Chisliter chisliter = new Chisliter();
            chisliter.broadcast(chisliter.readInteger(reader));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}