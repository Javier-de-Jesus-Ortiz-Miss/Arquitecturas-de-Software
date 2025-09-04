package entrega;

import java.util.List;

public class NameSorter {
	public List<String> sort(List<String> names) {
		names.sort(String::compareTo);
		return names;
	}
}
