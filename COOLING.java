import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class COOLING {
	private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private final PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		new COOLING().run();
	}

	private void run() throws IOException {
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			runTestCase();
		}
		pw.flush();
	}

	private void runTestCase() throws IOException {
		Integer pieCount = Integer.parseInt(br.readLine());
		List<Integer> pieWeights = readArrayInLine(" ");
		List<Integer> towerLoads = readArrayInLine(" ");
		Collections.sort(pieWeights);
		Collections.sort(towerLoads);
		Integer loadablePies = 0;
		Integer towerIndex = 0;
		for (Integer pieWeight : pieWeights) {
			while (towerIndex < pieCount) {
				if (towerLoads.get(towerIndex++) >= pieWeight) {
					loadablePies++;
					break;
				}
			}
			if (towerIndex >= pieCount) {
				break;
			}
		}
		pw.println(loadablePies);
	}

	private List<Integer> readArrayInLine(String seperator) throws IOException {
		String[] inputArray = br.readLine().split(seperator);
		List<Integer> resultArray = new ArrayList<>();
		for (String input : inputArray) {
			resultArray.add(Integer.parseInt(input));
		}
		return resultArray;
	}
}
