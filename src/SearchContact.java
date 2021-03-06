import java.util.ArrayList;
import java.util.Collections;

public final class SearchContact {
    private String firstName;
    private String secondName;
    private String surname;
    private String cellNo;
    private String tellPhoneNumber;
    private String emailAddress;
    private String timeStamp;
    private Integer constructorCode;
    private String searchByName;
    private int deleteOrViews;
    private ArrayList<ContactReadData> contactList;
    private  ArrayList<ContactReadData> searchResult = new ArrayList<>();
    private boolean found = false;

    public SearchContact(String searchByName, int deleteOrViews) {
        this.searchByName = searchByName;
        this.deleteOrViews = deleteOrViews;
        readAndSortData();
    }
    public void readAndSortData(){
        ReadContactStorage readContactStorage = new ReadContactStorage();
        contactList = readContactStorage.getContactList();
        Collections.sort(contactList,new SortByName());

        searchDataByName();
    }
    private void searchDataByName(){
        for(ContactReadData contactReadData : contactList){
            if(contactReadData.getFirstName().compareTo(searchByName) == 0){
                firstName = contactReadData.getFirstName();
                secondName = contactReadData.getSecondName();
                surname = contactReadData.getSurname();
                cellNo = contactReadData.getCellNo();
                tellPhoneNumber = contactReadData.getTellPhoneNumber();
                emailAddress = contactReadData.getEmailAddress();
                timeStamp = contactReadData.getTimeStamp();
                constructorCode = contactReadData.getConstructorCode();
                found = true;
            }
        }
        if(found) {
            setSearchByNameInitializer();
        }else{
            System.out.println("NOT FOUND");
            System.out.println("______________AVAILABLE CONTACTS______________");
            ContactViews contactViews = new ContactViews(contactList, "basic");
        }

    }

    public void setSearchByNameInitializer() {

        if (constructorCode == 1001) {
            searchResult.add(new ContactReadData(firstName, surname, cellNo, timeStamp));

        }
        if (constructorCode == 2001) {
            searchResult.add(new ContactReadData(firstName, secondName, surname, cellNo, timeStamp));
        }
        if (constructorCode == 3001) {
            searchResult.add(new ContactReadData(firstName, secondName, surname, cellNo, tellPhoneNumber, timeStamp));
        }
        if (constructorCode == 4001) {
            searchResult.add(new ContactReadData(firstName, secondName, surname, cellNo, tellPhoneNumber, emailAddress, timeStamp));
        }
        if (deleteOrViews == 5) {
            ContactViews contactViews = new ContactViews(searchResult, "full");
        }else if (deleteOrViews == 3){
            ContactDelete contactDelete = new ContactDelete(contactList,searchByName);
        }else if(deleteOrViews == 4){
            UpdateContact updateContact = new UpdateContact(contactList,searchResult,searchByName);
        }
    }

}
