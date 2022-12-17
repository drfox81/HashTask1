package taskOneTwo;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {

    private String nameRecipe;
    private int sumProducts;
    private static Set<Recipe> listRecipe = new HashSet<>();
    private Set<Products> recipeProducts = new HashSet<>();

    public Recipe(String nameRecipe) throws ErrorName {
        this.nameRecipe = Products.check(nameRecipe);
        if (getListRecipe().contains(this)) {
            try {
                throw new ErrorName(nameRecipe + " - есть уже! Меняй!");
            } catch (ErrorName name1) {
                System.out.println(name1.getMessage());
            }
        } else {
            getListRecipe().add(this);
        }
    }

    public void creatRecipe(Products products, int quantity) throws ErrorName {
        if (quantity > products.getQuantity()) {
            throw new ErrorName(products.getName() + " не достаточно, сходи в магазин");
        }
        recipeProducts.add(products);
        products.setQuantity(quantity);
        setSumProducts(getSumProducts() + products.getPrice() * quantity);
    }

    public Set<Products> getRecipeProducts() {
        return recipeProducts;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public int getSumProducts() {
        return sumProducts;
    }

    public static Set<Recipe> getListRecipe() {
        return listRecipe;
    }

    public void setSumProducts(int sumProducts) {
        this.sumProducts = sumProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(nameRecipe, recipe.nameRecipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameRecipe);
    }
}



