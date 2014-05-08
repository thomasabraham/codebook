import java.io.BufferedInputStream;
import java.io.IOException;

class TEST {
	public static void main(String[] args) throws IOException {
		BufferedInputStream br = new BufferedInputStream(System.in);
		int input;
		while ((input = getInt(br)) != 42) {
			System.out.println(input);
		}
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
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TEST {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input;
		while ((input = Integer.parseInt(br.readLine())) != 42) {
			System.out.println(input);
		}
		br.close();
	}
}
*/
