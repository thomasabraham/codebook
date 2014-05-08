import java.io.BufferedInputStream;
import java.io.IOException;

/**
 * Created by thomas on 10/2/14.
 */
class INTEST {

    public static void main(String args[]) throws IOException {
        BufferedInputStream br = new BufferedInputStream(System.in);
        long n, k, ti, count = 0;
        n = getInt(br);
        k = getInt(br);
        while (n-- > 0) {
            ti = getInt(br);
            if (ti % k == 0)
                count++;
        }
        System.out.println(count);
        br.close();
    }

    public static int getInt(BufferedInputStream bis) throws IOException {
        int result = 0;
        int input = 0;
        do {
            input = bis.read();
        } while (!Character.isDigit(input));
        result = input - 48;
        while (Character.isDigit(input = bis.read())) {
            result *= 10;
            result += input - 48;
        }
        return result;
    }
}
