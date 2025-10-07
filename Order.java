import java.util.ArrayList;

public class Order {
    private String customerName;
    private ArrayList<Product> products = new ArrayList<>();
    private PaymentMethod paymentMethod;

    public Order(String customerName) {
        this.customerName = customerName;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void setPaymentMethod(PaymentMethod method) {
        this.paymentMethod = method;
    }

    public void checkout() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        System.out.println("Khach hang: " + customerName 
            + ". Tong tien: " + total 
            + ". " + paymentMethod.pay(total));
    }
}
