import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MAXCOUNT {
	private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private final PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

	public static void main(String[] args) throws IOException {
		new MAXCOUNT().run();
	}

	private void run() throws IOException {
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			runTestCase();
		}
		pw.flush();
	}

	private void runTestCase() throws IOException {
		Integer arrayLength = Integer.parseInt(br.readLine());
		List<Integer> arrayList = readArrayInLine(" ");
		Map<Integer, Integer> countMap = new HashMap<>();
		Integer smallestItem = Integer.MAX_VALUE;
		Integer largestCount = 0;
		for (Integer item : arrayList) {
			Integer count = 0;
			if (countMap.containsKey(item)) {
				count = countMap.get(item) + 1;
			} else {
				count = 1;
			}
			countMap.put(item, count);
			if (largestCount < count) {
				smallestItem = item;
				largestCount = count;
			} else if (largestCount == count && smallestItem > item) {
				smallestItem = item;
				largestCount = count;
			}
		}
		pw.println(smallestItem + " " + largestCount);
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
