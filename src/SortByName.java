import java.util.Comparator;

public class SortByName implements Comparator<ContactReadData> {
    @Override
    public int compare(ContactReadData o1, ContactReadData o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }

}
