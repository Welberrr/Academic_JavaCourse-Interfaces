package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy");

	private LocalDate date;
	private double amount;
	
	private Installment() {
	}

	public Installment(LocalDate date, double amoutn) {
		this.date = date;
		this.amount = amoutn;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getAmoutn() {
		return amount;
	}

	public void setAmoutn(double amoutn) {
		this.amount = amoutn;
	}

	@Override
	public String toString() {
		return date.format(fmt) + " - " + String.format("%.2f", amount);
	}
}
