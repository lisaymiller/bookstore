import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Stream;

//left as Bookslist instead of utils
public class BooksList {

    public static void main(String[] args) {

    }

    private ArrayList<String> titles;
    private String name;
    private String address;

    public static void loadStringsToArray(ArrayList<String> arrList) throws IOException {
        Path path = Paths.get("Bookfile.txt");
        arrList.clear();

        // The stream file will also be closed here
        try (Stream<String> lines = Files.lines(path)) {
            Object[] arr = lines.toArray();

            for (Object t : arr) {
                arrList.add(t.toString());
            }
        }
    }

    private void loadTitles() {
        try {
            BooksList.loadStringsToArray(this.titles);
        } catch (IOException e) {
            // for now simply init the array to zero
            System.out.println("Could not initilize the titles");
            // make sure it is empty
            this.titles = new ArrayList<String>();

        }
    }

    public void Bookstore(String name, String address) {
        this.name = name;
        this.address = address;

        // all other members set here

        // init the array and then load it.
        titles = new ArrayList<String>();
        loadTitles();
    }

}