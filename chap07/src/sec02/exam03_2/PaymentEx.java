package sec02.exam03_2;

public class PaymentEx {
	public static void main(String[] args) {
		// 카드 결제
//		CardPayment cardPayment = new CardPayment();
//		cardPayment.pay(50000);
		
		// Paypal 결제
//		PaypalPayment paypalPayment = new PaypalPayment();
//		paypalPayment.pay(30000);
		
		// 계좌이체 결제
//		BankTransferPayment bankTransferPayment = new BankTransferPayment();
//		bankTransferPayment.pay(20000);
		
		// 다형성 사용
		PaymentService payment; // 부모 객체
		
		// 부모 객체 타입으로 자식 객체 생성
//		payment = new CardPayment(); 
//		payment = new PaypalPayment(); 
		payment = new BankTransferPayment();
		
		// 결제 수단(객체, 부품)을 바꿔도 개발 코드는 바뀌지 않음
		payment.pay(50000);
		
	}
}
