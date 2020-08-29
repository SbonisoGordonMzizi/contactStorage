import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReadContactStorage {
    private ArrayList<ContactReadData>contactList = new ArrayList<>();

    public ReadContactStorage() {
      readContactStorage();
    }

    private void readContactStorage(){
        final String fileName = "contactListFile.txt";
        String readline;
        String[] contactData;
        int code = 0;

        Path file = Paths.get(fileName);
        if(Files.exists(file) == true){
            try(FileReader fileReader = new FileReader(fileName)){
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while((readline = bufferedReader.readLine()) != null){
                    contactData = readline.split("/");
                    for(int i = 0; i < 1; i++){
                      code = Integer.parseInt(contactData[0]);
                      if(code == 1001){
                              contactList.add(new ContactReadData(contactData[1],contactData[2],contactData[3],contactData[4]));
                      }
                      if(code == 2001){
                          contactList.add(new ContactReadData(contactData[1],contactData[2],contactData[3],contactData[4],contactData[5]));
                      }
                      if(code == 3001){
                          contactList.add(new ContactReadData(contactData[1],contactData[2],contactData[3],contactData[4],contactData[5],contactData[6]));
                      }
                      if(code == 4001){
                          contactList.add(new ContactReadData(contactData[1],contactData[2],contactData[3],contactData[4],contactData[5],contactData[6],contactData[7]));
                      }
                    }
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }else{
            System.out.println("Database not found!");
        }

    }


    public ArrayList<ContactReadData> getContactList() {

        return contactList;
    }
}
