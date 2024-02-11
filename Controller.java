public class Controller {
    CheckFormat format = new CheckFormat();
    UserView view = new UserView();
    FileWrite write = new FileWrite();
    FileRead read = new FileRead();
    
    public void runToDo() throws Exception {
        boolean start = true;
        String name = new String();
        String date = new String();
        String phoneNumber = new String();
        String gender = new String();

        while (start) {
            name = view.getUserFullName();
            start = format.checkFullNameFormat(name);
        }

        start = true;

        while (start) {
            date = view.getUserDateBirth();
            start = format.checkDateBirthFormat(date);
        }
        start = true;
        while (start) {
            phoneNumber = view.getUserPhoneNumber();
            start = format.checkPhoneNumberFormat(phoneNumber);
        }
        start = true;
        while (start) {
            gender = view.getUserGender();
            start = format.checkGenderFormat(gender);
        }

        String data = new String(name + " " + date + " " + phoneNumber + " " + gender);
        write.createFile(data);

        String answer = view.getUserAnswer();
        
        if (answer.equals("1")) {
            String fileName = view.getUserReaderName();
            read.readFile(fileName);
        } else{
            System.out.println("Пока");
        }
    }
}