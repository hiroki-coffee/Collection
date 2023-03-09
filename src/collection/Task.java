package collection;

import java.time.LocalDate;

/*ソートについては、外部サイトで恐縮ですが、以下のサイトを参考にしてみてください！
https://pointsandlines.jp/server-side/java/list-sort-comparable

端的に言いますと、TaskクラスでComparableインターフェースを継承し、compareToメソッドを実装します。
このTaskクラスを含むListであれば、Collections.sort(list)ができるようになります。

compareToメソッドを実装してはじめて、sortを実行できるということですね！*/

public class Task implements Comparable<Task> {
	private LocalDate date;
	private String task;

	public LocalDate getDate() {
		return date;
	}

	public LocalDate setDate(LocalDate date) {
		this.date = date;
		return date;

	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}
	
	@Override
	public String toString() {
		return this.getDate() + ": " + getTask();
	}

	@Override
	public int compareTo(Task o) {
		return date.compareTo(o.date);
	}
	

}
