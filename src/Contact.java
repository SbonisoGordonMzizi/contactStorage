import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class Contact {
    private String firstName;
    private String secondName;
    private String surname;
    private String cellNo;
    private String tellPhoneNumber;
    private String emailAddress;
    private String timeStamp;
    private Integer constructorCode;
    {
        this.timeStamp = timeStamp();
    }
    public Contact(String firstName, String surname ,String cellNo) {
        this.firstName = firstName;
        this.surname = surname;
        this.cellNo = cellNo;
        this.constructorCode=1001;
    }
    public Contact(String firstName, String secondName, String surname,String cellNo) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
        this.cellNo = cellNo;
        this.constructorCode=2001;
    }
    public Contact(String firstName, String secondName, String surname,String cellNo, String tellPhoneNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
        this.cellNo = cellNo;
        this.tellPhoneNumber = tellPhoneNumber;
        this.constructorCode = 3001;
    }
    public Contact(String firstName, String secondName, String surname, String cellNo, String tellPhoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
        this.cellNo = cellNo;
        this.tellPhoneNumber = tellPhoneNumber;
        this.emailAddress = emailAddress;
        this.constructorCode = 4001;
    }

    public final String timeStamp() {
        LocalDateTime me = LocalDateTime.now();
        return me.format(DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss"));
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSurname() {
        return surname;
    }

    public String getCellNo() {
        return cellNo;
    }

    public String getTellPhoneNumber() {
        return tellPhoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public Integer getConstructorCode() {
        return constructorCode;
    }
}
