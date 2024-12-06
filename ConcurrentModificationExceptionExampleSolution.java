import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationExceptionExampleSolution {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));

        // Solution 1: Use Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("banana")) {
                iterator.remove();
            }
        }
        System.out.println("Solution 1: " + list);

        //Solution 2: Create a new list
        List<String> list2 = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        List<String> newList = new ArrayList<>();
        for(String item: list2){
            if(!item.equals("banana")){
                newList.add(item);
            }
        }
        System.out.println("Solution 2: " + newList);
    }
}