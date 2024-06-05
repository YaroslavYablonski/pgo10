import java.sql.SQLOutput;
import java.util.*;
    public class Main {
        public static void main(String[] args) {
            List<Item> items = new ArrayList<>();
            items.add(new Item(1, "BLA1"));
            items.add(new Item(2, "BLA2"));
            items.add(new Item(3, "BLA3"));
            items.add(new Item(4, "BLA4"));
            items.add(new Item(5, "BLA5"));
            items.add(new Item(6, "BLA6"));
            items.add(new Item(7, "BLA7"));
            items.add(new Item(8, "BLA8"));
            items.add(new Item(9, "BLA9"));
            items.add(new Item(10, "BLA10"));

            for (Item item : items) {
                item.show();
            }

            Map<Integer, String> itemMap = new HashMap<>();
            for (Item item : items) {
                itemMap.put(item.getId(), item.getName());
            }

            for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
            }
            List<Item> firstFiveItems = items.subList(0, 5);

            Set<Item> itemSet = new HashSet<>(firstFiveItems);

            for (Item item : itemSet) {
                System.out.println("HashSet Item: " + item);
            }
        }
    }
