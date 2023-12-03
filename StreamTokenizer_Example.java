import java.io.StringReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class StreamTokenizer_Example {
    public static void main(String[] args) {
        String exp = "10 + 33.2 * 5";

        try (StringReader reader = new StringReader(exp)) {
            StreamTokenizer tokenizer = new StreamTokenizer(reader);

            while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
                switch (tokenizer.ttype) {
                    case StreamTokenizer.TT_WORD:
                        System.out.println("Word: " + tokenizer.sval);
                        break;
                    case StreamTokenizer.TT_NUMBER:
                        System.out.println("Number: " + tokenizer.nval);
                        break;
                    default:
                        System.out.println("Token: " + (char) tokenizer.ttype);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
