package entrega;

public class Application {
    public Reader reader;
    public NameSorter nameSorter;
    public Formatter formatter;
    public Visualizer visualizer;

    public void main(String[] args) {
        reader = new Reader();
        nameSorter = new NameSorter();
        formatter = new Formatter();
        visualizer = new Visualizer();

        List<String> names = reader.read("names.txt");
        List<String> sortedNames = nameSorter.sort(names);
        List<String> formattedNames = formatter.format(sortedNames);
        visualizer.showResults(formattedNames);
    }
}
