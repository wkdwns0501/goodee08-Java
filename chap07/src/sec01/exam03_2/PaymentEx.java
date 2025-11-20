package sec01.exam03_2;

public class PaymentEx {
	public static void main(String[] args) {
		// 카드 결제
		CardPayment cardPayment = new CardPayment();
		cardPayment.pay(50000);
		
		// Paypal 결제
		PaypalPayment paypalPayment = new PaypalPayment();
		paypalPayment.pay(30000);
		
		// 계좌이체 결제
		BankTransferPayment bankTransferPayment = new BankTransferPayment();
		bankTransferPayment.pay(20000);
	}
}
