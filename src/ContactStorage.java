import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ContactStorage {
    private ArrayList<Contact>contactArrayList = new ArrayList<>();

    public ContactStorage(ArrayList<Contact> contactArrayList) {
        this.contactArrayList = contactArrayList;
        fileCreator();
    }

    private void fileCreator(){
        final String fileName = "contactListFile.txt";
        Path file = Paths.get(fileName);
        if(Files.exists(file) == false){
            //create file
            try {
                Files.createFile(file);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
         if(Files.exists(file) == true){   //read file
            try (FileWriter fileWriter = new FileWriter(fileName,true)){
                PrintWriter printWriter = new PrintWriter(fileWriter);
                for(Contact contact: contactArrayList){
                    if(contact.getConstructorCode() == 1001){
                         printWriter.println(contact.getConstructorCode()+"/"+contact.getFirstName()+"/"+contact.getSurname()+"/"+contact.getCellNo()+"/"+contact.timeStamp());
                    }
                    if(contact.getConstructorCode() == 2001){
                        printWriter.println(contact.getConstructorCode()+"/"+contact.getFirstName()+"/"+contact.getSecondName()+"/"+contact.getSurname()+"/"+ contact.getCellNo()+"/"+contact.timeStamp());
                    }
                    if(contact.getConstructorCode() == 3001){
                        printWriter.println(contact.getConstructorCode()+"/"+contact.getFirstName()+"/"+contact.getSecondName()+"/"+contact.getSurname()+"/"+contact.getCellNo()+"/"+contact.getTellPhoneNumber()
                                +"/"+contact.timeStamp());
                    }
                    if(contact.getConstructorCode() == 4001){
                        printWriter.println(contact.getConstructorCode()+"/"+contact.getFirstName()+"/"+contact.getSecondName()+"/"+contact.getSurname()+"/"+contact.getCellNo()+"/"+contact.getTellPhoneNumber()
                                +"/"+contact.getEmailAddress()+"/"+contact.timeStamp());
                    }
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
