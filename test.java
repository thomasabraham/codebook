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

