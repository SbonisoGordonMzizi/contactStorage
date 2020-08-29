public class ContactReadData {

    private String firstName;
    private String secondName;
    private String surname;
    private String cellNo;
    private String tellPhoneNumber;
    private String emailAddress;
    private String timeStamp;
    private Integer constructorCode;

    public ContactReadData(String firstName, String surname ,String cellNo, String timeStamp) {
        this.firstName = firstName;
        this.surname = surname;
        this.cellNo = cellNo;
        this.timeStamp = timeStamp;
        this.constructorCode=1001;
    }
    public ContactReadData(String firstName, String secondName, String surname,String cellNo, String timeStamp) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
        this.cellNo = cellNo;
        this.timeStamp = timeStamp;
        this.constructorCode=2001;
    }
    public ContactReadData(String firstName, String secondName, String surname,String cellNo, String tellPhoneNumber,String timeStamp) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
        this.cellNo = cellNo;
        this.tellPhoneNumber = tellPhoneNumber;
        this.constructorCode = 3001;
        this.timeStamp = timeStamp;
    }
    public ContactReadData(String firstName, String secondName, String surname, String cellNo, String tellPhoneNumber, String emailAddress, String timeStamp) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
        this.cellNo = cellNo;
        this.tellPhoneNumber = tellPhoneNumber;
        this.emailAddress = emailAddress;
        this.constructorCode = 4001;
        this.timeStamp = timeStamp;
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