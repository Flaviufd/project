import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pantry {
    private final int capacity;
    private final List<Item> items;

    public Pantry(int capacity) {
        this.capacity = capacity;
        items = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    @Override
    public String toString() {
        return "Pantry{" +
                "capacity=" + capacity +
                ", items=" + items +
                '}';
    }

    public boolean addItem(Item item) {
        if (capacity < usedCapacity() + item.getAmount()) {
            return false;
        }

        items.add(item);
        return true;
    }

    private int usedCapacity() {
        int usedCapacity = 0;
        for (Item item : items) {
            usedCapacity += item.getAmount();
        }
        return usedCapacity;
    }
}