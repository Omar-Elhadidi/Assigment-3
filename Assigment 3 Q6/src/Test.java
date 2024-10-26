public class Test {
    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();

        GroceryItemOrder cookies = new GroceryItemOrder("Cookies", 2.30);
        cookies.setQuantity(4);

        GroceryItemOrder milk = new GroceryItemOrder("Milk", 1.50);
        milk.setQuantity(2);

        GroceryItemOrder bread = new GroceryItemOrder("Bread", 2.00);
        bread.setQuantity(3);

        groceryList.add(cookies);
        groceryList.add(milk);
        groceryList.add(bread);

        double totalCost = groceryList.getTotalCost();
        System.out.printf("Total cost of grocery items: $%.2f%n", totalCost);

        for (int i = 0; i < 10; i++) {
            groceryList.add(new GroceryItemOrder("Item" + (i + 1), 1.00));
        }
    }
}
