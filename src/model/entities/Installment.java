package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
	
	private Date dueDate;
	private Double amount;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Installment(Date dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public Double getAmount() {
		return amount;
	}
	
	@Override
	public String toString() {
		return sdf.format(dueDate) + " - " + amount;
	}

}
