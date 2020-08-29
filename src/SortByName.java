import java.util.Comparator;

public class SortByName implements Comparator<Contact> {
    @Override
    public int compare(Contact o1, Contact o2) {
        return o1.getFirstName().compareTo(o1.getFirstName());
    }

}
