import java.util.ArrayList;

public final class  ContactDelete {
    private ArrayList<ContactReadData> searchResult;
    private String searchByname;
    private int controller;
    public ContactDelete(ArrayList<ContactReadData> searchResult,String searchByName) {
        this.searchResult = searchResult;
        this.searchByname = searchByName;
        deleteContact();
        displayUpTodateList();

    }
    public ContactDelete(ArrayList<ContactReadData> searchResult,String searchByName,int controller) {
        this.searchResult = searchResult;
        this.searchByname = searchByName;
        deleteContact();
        displayUpTodateList1();

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
    private void displayUpTodateList1(){
        ContactStorage contactStorage = new ContactStorage(searchResult,3);
    }
}
