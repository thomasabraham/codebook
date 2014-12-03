import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CIELRCPT {

	private static final int FULL_COURSE_PRICE = 2048;

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			int totalPrice = Integer.parseInt(br.readLine());
			int fullCourseCount = totalPrice / FULL_COURSE_PRICE;
			int sideDishtotal = totalPrice % FULL_COURSE_PRICE;
			System.out.println(fullCourseCount + Integer.bitCount(sideDishtotal));
		}
	}
}
