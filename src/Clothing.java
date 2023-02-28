class Product{
    private int id;
    private double price;

    public Product(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public double getDiscountPrice(){
        return price * 0.9; // given the price will be positive.
    }
}

class Clothing extends Product{
    private String fabric;
    private String color;

    public Clothing(int id, double price, String fabric, String color) {
        super(id, price);
        this.fabric = fabric;
        this.color = color;
    }

    @Override
    public double getDiscountPrice(){
        return super.getDiscountPrice() - 10; // given the price will be positive.
    }
}

class Book extends Product{
    private String bookName;
    private String author;

    public Book(int id, double price, String bookName, String author) {
        super(id, price);
        this.bookName = bookName;
        this.author = author;
    }

}

class Cart{
    private String name;
    private Product[] arr;
    private int current;
}



