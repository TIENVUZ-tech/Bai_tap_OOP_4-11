import java.util.ArrayList;
import java.util.List;

public class ListSortable<E extends Comparable<E>> {
    private List<E> list = new ArrayList<>();

    public void add(E other) {
        list.add(other);
    }

    public void print() {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    E temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);  
                }
            }
        }

        for (E thesis : list) {
            System.out.println(thesis.toString());
        }
    }
}
