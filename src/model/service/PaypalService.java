package model.service;

public class PaypalService implements OnlinePaymentService {
	
	public Double paymentFee(Double amount) {
		return amount * 0.02 + amount;
	}
	
	public Double interest(Double amount, Integer months) {
		return amount * 0.01 * months + amount;
	}

}
