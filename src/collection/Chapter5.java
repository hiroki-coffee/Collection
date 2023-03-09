package collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter5 extends Task {

	public static void main(String[] args) throws Exception {

		// プログラムを作成

		Task e1 = new Task();
		LocalDate date1 = LocalDate.of(2021, 10, 21);
		e1.setDate(date1);
		e1.setTask("牛乳を買う。");

		Task e2 = new Task();
		LocalDate date2 = LocalDate.of(2021, 9, 15);
		e2.setDate(date2);
		e2.setTask("○○社面談。");

		Task e3 = new Task();
		LocalDate date3 = LocalDate.of(2021, 12, 4);
		e3.setDate(date3);
		e3.setTask("手帳を買う。");

		Task e4 = new Task();
		LocalDate date4 = LocalDate.of(2021, 8, 10);
		e4.setDate(date4);
		e4.setTask("散髪に行く。");

		Task e5 = new Task();
		LocalDate date5 = LocalDate.of(2021, 11, 9);

		e5.setDate(date5);
		e5.setTask("スクールの課題を解く。");

		List<Task> list = new ArrayList<>();

		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		Collections.sort(list);
		for (Task work : list) {
			System.out.println(work);
		}

	}

}
