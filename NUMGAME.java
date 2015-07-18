import java.io.*;
/*
One is always a divisor.
Odd Numbers can have only odd divisors. 
Odd Number - Odd Number = even number.
If odd number always lose then even number can always win by using 1 to give odd number to opponent.
And odd number always lose because it always have to give even number to opponent.
*/
class NUMGAME {

	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			long n = Long.parseLong(br.readLine());
			if (n % 2 == 0) {
				pw.println("ALICE");
			} else {
				pw.println("BOB");
			}
		}
		pw.flush();
	}
}
