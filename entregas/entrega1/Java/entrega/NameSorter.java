package entrega;

import java.util.List;
import java.util.Comparator;

public class NameSorter {
    public List<String> sort(List<String> names) {
        names.sort(Comparator.reverseOrder());
        return names;
	}
}