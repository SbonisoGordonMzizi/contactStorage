import java.util.ArrayList;

public class ContactViews {
    private ArrayList<ContactReadData> contactList;
    private String viewType = "basic";

    public ContactViews(ArrayList<ContactReadData> contactList,String viewType) {
        this.contactList = contactList;
        this.viewType = viewType;
        views();
    }

    private void views() {
     switch(viewType){
         case "full":
        System.out.println("___________________Contacts___________________");
       for(int i = 0; i < contactList.size();i++){
           if(contactList.get(i).getConstructorCode() == 1001){

             System.out.println(i+1+")   "+contactList.get(i).getFirstName()+" "+contactList.get(i).getSurname());
             System.out.println("          "+contactList.get(i).getCellNo() );
             System.out.println("                    Date : "+contactList.get(i).getTimeStamp() );
           }
           if(contactList.get(i).getConstructorCode() == 2001){
               System.out.println(i+1+")   "+contactList.get(i).getFirstName()+" "+contactList.get(i).getSecondName()+" "+contactList.get(i).getSurname());
               System.out.println("               "+contactList.get(i).getCellNo() );
               System.out.println("                    Date : "+contactList.get(i).getTimeStamp() );
           }
           if(contactList.get(i).getConstructorCode() == 3001){
               System.out.println(i+1+")   "+contactList.get(i).getFirstName()+" "+contactList.get(i).getSecondName()+" "+contactList.get(i).getSurname());
               System.out.println("               "+contactList.get(i).getCellNo() );
               System.out.println("               "+contactList.get(i).getTellPhoneNumber());
               System.out.println("                    Date : "+contactList.get(i).getTimeStamp() );
           }
           if(contactList.get(i).getConstructorCode() == 4001){
               System.out.println(i+1+")   "+contactList.get(i).getFirstName()+" "+contactList.get(i).getSecondName()+" "+contactList.get(i).getSurname());
               System.out.println("               "+contactList.get(i).getCellNo() );
               System.out.println("               "+contactList.get(i).getTellPhoneNumber() );
               System.out.println("               "+contactList.get(i).getEmailAddress() );
               System.out.println("                    Date : "+contactList.get(i).getTimeStamp() );
           }
       }
        System.out.println("______________________________________________");
       break;
         case "basic":
             System.out.println("___________________Contacts___________________");
             for(int i = 0; i < contactList.size();i++){
                 if(contactList.get(i).getConstructorCode() == 1001){

                     System.out.println(i+1+")   "+contactList.get(i).getFirstName()+" "+contactList.get(i).getSurname());
                     System.out.println("          "+contactList.get(i).getCellNo() );

                 }
                 if(contactList.get(i).getConstructorCode() == 2001){
                     System.out.println(i+1+")   "+contactList.get(i).getFirstName()+" "+contactList.get(i).getSurname());
                     System.out.println("          "+contactList.get(i).getCellNo() );

                 }
                 if(contactList.get(i).getConstructorCode() == 3001){
                     System.out.println(i+1+")   "+contactList.get(i).getFirstName()+" "+contactList.get(i).getSurname());
                     System.out.println("          "+contactList.get(i).getCellNo() );

                 }
                 if(contactList.get(i).getConstructorCode() == 4001){
                     System.out.println(i+1+")   "+contactList.get(i).getFirstName()+" "+contactList.get(i).getSurname());
                     System.out.println("          "+contactList.get(i).getCellNo() );
                 }
             }
             System.out.println("______________________________________________");


             break;
     }
    }
}
