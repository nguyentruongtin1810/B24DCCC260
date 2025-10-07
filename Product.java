public class Product {
    private String id;
    private String name;
    private double price;
    private String type;
    private String extraInfo; // IMEI hoặc HSD

    public Product(String id, String name, double price, String type, String extraInfo) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.extraInfo = extraInfo;
    }

    public double getPrice() {
        return price;
    }
}

