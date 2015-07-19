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
		for (Integer item : arrayList) {
			if (countMap.containsKey(item)) {
				countMap.put(item, countMap.get(item) + 1);
			} else {
				countMap.put(item, 1);
			}
		}
		Integer largestKey = Integer.MAX_VALUE;
		Integer largestVal = 0;
		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			if (largestVal < entry.getValue()) {
				largestKey = entry.getKey();
				largestVal = entry.getValue();
			} else if (largestVal == entry.getValue() && largestKey > entry.getKey()) {
				largestKey = entry.getKey();
				largestVal = entry.getValue();
			}
		}
		pw.println(largestKey + " " + largestVal);
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
