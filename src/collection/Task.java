package collection;

import java.time.LocalDate;

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
