public class GroceryList {
    private GroceryItemOrder[] items;
    private int size;
    private static final int MAX_ITEMS = 10;

    public GroceryList() {
        items = new GroceryItemOrder[MAX_ITEMS];
        size = 0;
    }

    public void add(GroceryItemOrder item) {
        if (size < MAX_ITEMS) {
            items[size] = item;
            size++;
        } else {
            System.out.println("Cannot add more items. The grocery list is full.");
        }
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < size; i++) {
            totalCost += items[i].getCost();
        }
        return totalCost;
    }
}
