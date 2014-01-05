import java.util.Scanner;

class TEST {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int i = sc.nextInt();
			if (i == 42) {
				break;
			} else {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
