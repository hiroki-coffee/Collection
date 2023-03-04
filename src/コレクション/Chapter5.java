package コレクション;

import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Chapter5 extends Task {

	public static void main(String[] args) throws Exception {

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日:");

		String d1 = (dateTimeFormatter.format(t1) + " " + w1);
		String d2 = (dateTimeFormatter.format(t2) + " " + w2);
		String d3 = (dateTimeFormatter.format(t3) + " " + w3);
		String d4 = (dateTimeFormatter.format(t4) + " " + w4);
		String d5 = (dateTimeFormatter.format(t5) + " " + w5);

		// プログラムを作成
		Map<Integer, String> work = new HashMap<Integer, String>();
		work.put(2, d1);
		work.put(1, d2);
		work.put(4, d3);
		work.put(0, d4);
		work.put(3, d5);

		for (String todo : work.values()) {
			System.out.println(todo);
		}
	}
}
