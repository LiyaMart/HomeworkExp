import java.util.regex.Pattern;

public class CheckFormat {

    public boolean checkFullNameFormat(String name) throws RuntimeException{

        String[] splitName = name.split(" ");

        try{
            if ( splitName.length != 3 ) {
                throw new RuntimeException("Hеверный формат ввода ФИО! Попробуйте снова."); 
            }
            else if (splitName[0].matches("\\p{IsLatin}+") != true && splitName[1].matches("\\p{IsLatin}+") != true && splitName[2].matches("\\p{IsLatin}+") != true) {
                throw new RuntimeException("ФИО должно быть на латинице! Попробуйте снова."); 
            }
            return false;
        }      catch(RuntimeException e){
                System.out.println(e.getMessage());
                return true;
            }       
    }

     public boolean checkDateBirthFormat(String date) throws RuntimeException{

        try{
            if (date.length()!=10 && date.charAt(2) != '.' && date.charAt(5) != '.') {
                throw new RuntimeException("Неверный формат ввода даты! Попробуйте снова.");
                    }
                else{
                    String[] splitDate = date.split(Pattern.quote("."));
                    Integer.valueOf(splitDate[0]);
                    Integer.valueOf(splitDate[1]);
                    Integer.valueOf(splitDate[2]);
                }
                return false;
    } catch (NumberFormatException e) {

    System.out.println("Дата должна состоять из чисел! Попробуйте снова.");
    return true;
}
        catch(RuntimeException e){
            System.out.println(e.getMessage());
            return true;
        }   
      
    }

    public boolean checkPhoneNumberFormat(String number) throws RuntimeException{
      try {
        if (number.length() != 10) {
            throw new RuntimeException("Необходимо ввести 10 цифр! Попробуйте снова.");
        }
        else{
            Long.parseLong(number);

        }
        return false;
        
      } catch (NumberFormatException e) {
        System.out.println("Необходимо ввести цифры! Попробуйте снова.");
        return true;
    }
    catch (RuntimeException e) {
        System.out.println(e.getMessage());
        return true;
      }
           
        }      


    public boolean checkGenderFormat(String gender) throws RuntimeException{
        
        try {
            if (gender.length()!=1 || (!gender.equals("m") && !gender.equals("f"))){
                throw new RuntimeException("Неверный ввод пола! Попробуйте снова.");               
            }
            return false;
            
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            return true;
        }
    
    }
}
        
        
           
        