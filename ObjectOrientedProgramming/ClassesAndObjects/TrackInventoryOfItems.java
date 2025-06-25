package ClassesAndObjects;

public class TrackInventoryOfItems {
    int itemCode;
    String itemName;
    double price;

    public TrackInventoryOfItems(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: $" + price);
    }

    public double calculateTotalCost(int quantity){
        return price * quantity;
    }
    public static void main(String[] args) {
        TrackInventoryOfItems item1 = new TrackInventoryOfItems(1, "Apple",45.0);
        item1.displayDetails();
        
    }
}
