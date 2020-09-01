import java.util.ArrayList;

public class ContactDelete {
    private ArrayList<ContactReadData> searchResult;
    private ArrayList<Contact> deleteResult;
    private String searchByname;
    public ContactDelete(ArrayList<ContactReadData> searchResult,String searchByName) {
        this.searchResult = searchResult;
        this.searchByname = searchByName;
        deleteContact();
        displayUpTodateList();

    }
    private void deleteContact(){
       for(int i = 0; i < searchResult.size(); i++){
           if(searchResult.get(i).getFirstName().equals(searchByname)){
               searchResult.remove(i);
           }
       }
    }

    private void displayUpTodateList(){
        System.out.println("_____________SUCCESSFULLY DELETED ____________");
        ContactViews contactViews = new ContactViews(searchResult,"basic");
        ContactStorage contactStorage = new ContactStorage(searchResult,3);
    }
}
