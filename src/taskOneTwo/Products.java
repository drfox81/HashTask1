package taskOneTwo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Products {
    private String name;//
    private int price;// руб
    private int quantity;//кг

    private static Set<Products> listProducts = new HashSet<>();

    public static Set<Products> getListProducts() {
        return listProducts;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Products(String name, int price,int quantity) throws ErrorName {
        this.name = check(name);
        this.price = check(price);
        this.quantity=check(quantity);

        if (listProducts.contains(this)) {
            try {
                throw new ErrorName(this.getName() + " - есть уже! Меняй!");
            } catch (ErrorName name1) {
                System.out.println(name1.getMessage());
            }
        } else {
            listProducts.add(this);
        }
    }

    public static String check(String str) throws ErrorName {
        if (str != null && !str.isEmpty() && !str.isBlank()) {
            return str;
        } else {
            throw new ErrorName("Это че за ерунда! Введите название");
        }
    }
    public int check(int number) throws ErrorName {
        if (number > 0) {
            return number;
        } else {
            throw new ErrorName("Это че за ерунда! Введите верно");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Objects.equals(name, products.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + ", цена "+ price +
                ", количество " + quantity +"кг.";
    }
}