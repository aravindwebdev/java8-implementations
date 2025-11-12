import java.util.*;
import java.util.stream.*;

class Problem44 {
    public static void main(String[] args){
        List<Product> productList = Arrays.asList(
            new Product(1, "mobile", 150, "electronic"),
            new Product(2, "laptop", 200, "electronic"),
            new Product(3, "pc", 250, "electronic")
        );

       List<String> filterName= productList.steam().filter( x -> x.getPrice()<100).map(x->x.getName()).collect(Collectors.toList());
        System.out.println(filterName);

        List<Product> reducedPrice = productList.stream().map(product->{
            double discountedPrice = product.getPrice()*0.80;
            product.setPrice(discountedPrice);
            return product;
            }
            ).collect(Collectors.toList());

        Double averagePrice = productList.stream().mapToDouble(Product::getPrice).average().getAsDouble();
        Optional<Product> lowestPriceProduct = productList.stream().min(x1,x2 -> Double.compare(x1.getPrice(), x2.getPrice()));
        if(lowestPriceProduct.isPresent())
        {
            System.out.println(lowestPriceProduct.get());
        } System.out.println("Product not found");
    }
}

class Product {
    private int id;
    private String name;
    private double price;
    private String category;

    public Product(int id, String name, double price, String category){
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public double setPrice(double price){
        this.price = price;
    }
    public void getPrice(){
        return price;
    }
    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category = category;
    }

}