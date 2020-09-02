import java.util.ArrayList;
import java.util.Scanner;


public class UpdateContact {
    private String firstName = "";;
    private String secondName = "";
    private String surname ="";
    private String cellNo ="";
    private String tellPhoneNumber  ="";
    private String emailAddress = "";
    private String timeStamp ="";
    private Integer checkChangesName = 0;
    private Integer checkChangesEmail = 0;
    private Integer checkChangesTell = 0;
    private ArrayList<ContactReadData> searchResult;
    private String searchByname;
    private ArrayList<ContactReadData> userlist;
    private int index;
    ArrayList<Contact>contactList = new ArrayList<>();



    public UpdateContact(ArrayList<ContactReadData> userlist,ArrayList<ContactReadData>searchResult, String searchByName) {
        this.userlist = userlist;
        this.searchResult = searchResult;
        this.searchByname = searchByName;
        listSearchResult();
    }
    private void listSearchResult(){
       // for(int i = 0; i < userlist.size();i++) {
          if(searchResult.get(0).getConstructorCode() == 1001){

              for(int i = 0; i < searchResult.size();i++){
                  System.out.println("FirstName     : " +searchResult.get(i).getFirstName());
                  System.out.println("SecondName    : " +secondName);
                  System.out.println("Surname       : "+searchResult.get(i).getSurname());
                  System.out.println("Cell Number   : "+searchResult.get(i).getCellNo());
                  System.out.println("Tell Number   : "+tellPhoneNumber);
                  System.out.println("Email Address : "+emailAddress);
                  System.out.println("TimeStamp     : "+searchResult.get(i).getTimeStamp());

                  firstName = searchResult.get(i).getFirstName();
                  surname = searchResult.get(i).getSurname();
                  cellNo = searchResult.get(i).getCellNo();
                  timeStamp = searchResult.get(i).getTimeStamp();
              }

          }
          if(searchResult.get(0).getConstructorCode() == 2001){

              for(int i = 0; i < searchResult.size();i++){
                  System.out.println("FirstName     : " +searchResult.get(i).getFirstName());
                  System.out.println("SecondName    : " +searchResult.get(i).getSecondName());
                  System.out.println("Surname       : "+searchResult.get(i).getSurname());
                  System.out.println("Cell Number   : "+searchResult.get(i).getCellNo());
                  System.out.println("Tell Number   : "+tellPhoneNumber);
                  System.out.println("Email Address : "+emailAddress);
                  System.out.println("TimeStamp     : "+searchResult.get(i).getTimeStamp());

                  firstName = searchResult.get(i).getFirstName();
                  secondName = searchResult.get(i).getSecondName();
                  surname = searchResult.get(i).getSurname();
                  cellNo = searchResult.get(i).getCellNo();
                  timeStamp = searchResult.get(i).getTimeStamp();
              }
          }
          if(searchResult.get(0).getConstructorCode() == 3001){

              for(int i = 0; i < searchResult.size();i++){
                  System.out.println("FirstName     : " +searchResult.get(i).getFirstName());
                  System.out.println("SecondName    : " +searchResult.get(i).getSecondName());
                  System.out.println("Surname       : "+searchResult.get(i).getSurname());
                  System.out.println("Cell Number   : "+searchResult.get(i).getCellNo());
                  System.out.println("Tell Number   : "+searchResult.get(i).getTellPhoneNumber());
                  System.out.println("Email Address : "+emailAddress);
                  System.out.println("TimeStamp     : "+searchResult.get(i).getTimeStamp());

                  firstName = searchResult.get(i).getFirstName();
                  secondName = searchResult.get(i).getSecondName();
                  surname = searchResult.get(i).getSurname();
                  cellNo = searchResult.get(i).getCellNo();
                  tellPhoneNumber = searchResult.get(i).getTellPhoneNumber();
                  timeStamp = searchResult.get(i).getTimeStamp();
              }
          }
          if(searchResult.get(0).getConstructorCode() == 4001){
              for(int i = 0; i < searchResult.size();i++){
                  System.out.println("FirstName     : " +searchResult.get(i).getFirstName());
                  System.out.println("SecondName    : " +searchResult.get(i).getSecondName());
                  System.out.println("Surname       : "+searchResult.get(i).getSurname());
                  System.out.println("Cell Number   : "+searchResult.get(i).getCellNo());
                  System.out.println("Tell Number   : "+searchResult.get(i).getTellPhoneNumber());
                  System.out.println("Email Address : "+searchResult.get(i).getEmailAddress());
                  System.out.println("TimeStamp     : "+searchResult.get(i).getTimeStamp());

                  firstName = searchResult.get(i).getFirstName();
                  secondName = searchResult.get(i).getSecondName();
                  surname = searchResult.get(i).getSurname();
                  cellNo = searchResult.get(i).getCellNo();
                  tellPhoneNumber = searchResult.get(i).getTellPhoneNumber();
                  emailAddress = searchResult.get(i).getEmailAddress();
                  timeStamp = searchResult.get(i).getTimeStamp();
              }
          }
            userOptionsInstruction1();
    }

    private void userOptionsInstruction1(){
        System.out.println("______________________________________________");
        System.out.println("_______________UPDATING OPTIONS_______________");
        System.out.println("______________________________________________");
        System.out.println("Enter   :  A NUMBER OF A FIELD AND THE VALUE  ");
        System.out.println("        :  EXAMPLE > 1 Robben  3 Smith        ");
        System.out.println("        : (1) FirstName    (2) SecondName     ");
        System.out.println("        : (3) Surname      (4) Cell Number    ");
        System.out.println("        : (5) Tell Number  (6) Email Address  ");
        System.out.println("______________________________________________");
        indexSearch();
        editing();
    }

   private void editing(){
       System.out.print(">> ");
       Scanner scanner = new Scanner(System.in);
       String mm = scanner.nextLine();
       String[] mmString = mm.split(" ");
        for(int i = 0; i < mmString.length; i++){
            if(mmString[i].equals("1")){
                firstName =mmString[i+1];
                userlist.get(index).setFirstName(mmString[i+1]);
            }
            if(mmString[i].equals("2")){
                secondName = mmString[i+1];
                userlist.get(index).setSecondName(mmString[i+1]);
            }
            if(mmString[i].equals("3")){
                surname = mmString[i+1];
                userlist.get(index).setSurname(mmString[i+1]);
            }
            if(mmString[i].equals("4")){
                cellNo = mmString[i+1];
                userlist.get(index).setCellNo(mmString[i+1]);
            }
            if(mmString[i].equals("5")){
                tellPhoneNumber = mmString[i+1];
                userlist.get(index).setTellPhoneNumber(mmString[i+1]);
            }
            if(mmString[i].equals("6")){
                emailAddress = mmString[i+1];
                userlist.get(index).setEmailAddress(mmString[i+1]);
            }
        }
       removeblanks();
   }
   private void indexSearch(){
       for(int i = 0; i < userlist.size(); i++){
           if(userlist.get(i).getFirstName().equals(searchByname)){
               index = i;
           }
       }
   }

   private void removeblanks(){

       if(!secondName.isEmpty()){
           checkChangesName++;
           if(!tellPhoneNumber.isEmpty()){
               checkChangesTell++;
           }
           if(!emailAddress.isEmpty()){
               checkChangesEmail++;
           }
       }

       deleteOldContact();
   }

   private void deleteOldContact(){
        ContactDelete contactDelete = new ContactDelete(userlist,searchByname,100);
        objectCreate();
   }
   private void objectCreate(){
       int controller = 3;
        int controllerResult = controller + checkChangesTell + checkChangesName + checkChangesEmail;
       if(controllerResult == 3){
           Contact contact1 = new Contact(firstName,surname,cellNo);
           contactList.add(contact1);
       }
       if(controllerResult == 4){
           Contact contact1 = new Contact(firstName,secondName,surname,cellNo);
           contactList.add(contact1);
       }
       if(controllerResult == 5){
           Contact contact1 = new Contact(firstName,secondName,surname,cellNo,tellPhoneNumber);
           contactList.add(contact1);
       }
       if(controllerResult == 6){
           Contact contact1 = new Contact(firstName,secondName,surname,cellNo,tellPhoneNumber,emailAddress);
           contactList.add(contact1);
       }
       ContactStorage storage = new ContactStorage(contactList);
       System.out.println("_____________SUCCESSFULLY UPDATED_____________");
       System.out.println("______________________________________________");
   }

}
