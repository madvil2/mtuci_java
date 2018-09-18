import java.io.BufferedReader;
import java.io.IOException;

public class Palindromer {

    public String readString(BufferedReader reader) throws IOException {
        System.out.print("Enter word: ");
        return reader.readLine();
    }

    public void broadcast(String text) {
        System.out.println(text);
    }

    public boolean isPalindrome(String word) {
        word = word.toLowerCase();
        StringBuilder builder = new StringBuilder(word);
        builder.reverse();
        return builder.toString().equals(word);
    }

}