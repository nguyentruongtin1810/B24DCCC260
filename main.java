public class Main {
    public static void main(String[] args) {
        
        Product p1 = new Product("E01", "Redmi note 13 ", 4000000, "Electronic", "IMEI1810");
        Product p2 = new Product("F01", "Banh mi ", 20000, "Food", "HSD: 10/2025");

       
        Order order = new Order("Nguyen Truong Tin ");
        order.addProduct(p1);
        order.addProduct(p2);
        order.setPaymentMethod(new MomoPayment());
        order.checkout();
    }
}
