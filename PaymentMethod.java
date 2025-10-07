interface  PaymentMethod {
    void pay(String customer , double amount);
}
class CashPayment implements PaymentMethod {
    public void pay(String customer , double amount ) {
        System.out.println("Khách hàng: " + customer + " Tổng tiền " + amount + "VNĐ. Thanh toán bằng tiền mặt thành công ");
    }
}
class CreditCardPayment implements PaymentMethod {
    public void pay(String customer , double amount ) {
        System.out.println("Khách hàng: " + customer + " Tổng tiền " + amount + "VNĐ. Thanh toán bằng thẻ tín dụng thành công ");
    }
}
class MomoPayment implements PaymentMethod {
    public void pay(String customer , double amount ) {
        System.out.println("Khách hàng: " + customer + " Tổng tiền " + amount + "VNĐ. Thanh toán bằng momo thành công ");
    }
}
