package ClassesAndObjects;

import java.util.ArrayList;

public class CartItem {
    String itemName;
    int quantity;
    double price;

    public CartItem(String itemName, int quantity, double price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotalPrice(){
        return quantity * price;
    }


}

public class ShoppingCart {
    ArrayList<CartItem> cart =new ArrayList<>();

    public void addItem(String itemName, int quantity, double price) {
        CartItem item = new CartItem(itemName, quantity, price);
        cart.add(item);
        System.out.println(quantity + "x" + itemName + "added to cart");
    }

    public void removeItem(String itemName) {
        boolean removed = false;
        for(int i=0;i<cart.size();i++){
            if(cart.get(i).itemName.equalsIgnoreCase(itemName)){
                cart.remove(i);
                System.out.println(itemName + "removed from cart");
                removed = true;
                break;
            }
        }
        if(!removed){
            System.out.println(itemName + "not found in cart");
        }
    }
    public void displayTotal(){
        double total = 0;
        for(CartItem item:cart){
            System.out.println(item.itemName + "-$" + item.price + "x" + item.quantity + "=$" + item.getTotalPrice());
            total += item.getTotalPrice();
        }
        System.out.println("Total Cost: $" + total);
    }
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple", 2, 1.00);
        cart.addItem("Banana", 3, 0.50);
        
        cart.displayTotal();
        cart.removeItem("Apple");
        cart.displayTotal();
    }
}
