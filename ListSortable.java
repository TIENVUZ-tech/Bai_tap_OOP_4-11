import java.util.ArrayList;
import java.util.List;

public class ListSortable<E extends Comparable<E>> {
    private List<E> list = new ArrayList<>();

    public void add(E other) {
        list.add(other);
    }

    public void print() {
        for (E thesis : list) {
            System.out.println(thesis.toString());
        }
    }
}
