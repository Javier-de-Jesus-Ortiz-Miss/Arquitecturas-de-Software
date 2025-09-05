package entrega;

import java.util.List;
public class Application {
    public Reader reader;
    public NameSorter nameSorter;
    public Formatter formatter;
    public Visualizer visualizer;

	public Application() {
		this.reader = new Reader();
		this.nameSorter = new NameSorter();
		this.formatter = new Formatter();
		this.visualizer = new Visualizer();
	}

    public void run() {
        List<String> names = reader.readDocument("names.txt");
        List<String> sortedNames = nameSorter.sort(names);
        List<String> formattedNames = formatter.applyFormat(sortedNames);
        visualizer.showResults(formattedNames);
    }
}
