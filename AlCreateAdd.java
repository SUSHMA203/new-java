mport java.util.ArrayList;
import java.util.List;

public class ModifyingList {

    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        fillList(items);

        items.set(3, "Industrial");
        items.add("Contemporary");
        items.remove(0);
        items.remove("Traditional");
		

        for (Object el : items) {

            System.out.println(el);
        }

        items.clear();

        if (items.isEmpty()) {

            System.out.println("The list is empty");
        } else {
            System.out.println("The list is not empty");
        }
    }

    public static void fillList(List<String> list) {

        list.add("Nautical");
        list.add("Contemporary");
        list.add("Modern");
        list.add("Minimal");
        list.add("Mediterranean");
    }

