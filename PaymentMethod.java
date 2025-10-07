interface PaymentMethod {
    String pay(double amount);
}

class CashPayment implements PaymentMethod {
    public String pay(double amount) {
        return "Thanh toan tien mat thanh cong!";
    }
}

class CreditCardPayment implements PaymentMethod {
    public String pay(double amount) {
        return "Thanh toan bang the tin dung thanh cong!";
    }
}

class MomoPayment implements PaymentMethod {
    public String pay(double amount) {
        return "Thanh toan qua Momo thanh cong!";
    }
}
