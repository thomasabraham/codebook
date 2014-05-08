

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HS08TEST {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[] = br.readLine().split(" ");
		int amt = Integer.parseInt(input[0]);
		double bal = Double.parseDouble(input[1]);
		if (amt % 5 == 0 && ((double) amt) + 0.5 <= bal) {
			bal -= amt;
			bal -= 0.5;

		}
		System.out.printf("%.2f",bal);
		br.close();
	}
}
