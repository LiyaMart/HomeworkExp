import java.util.Scanner;

public class UserView {

    private Scanner scanner;

    public UserView() {
        scanner = new Scanner(System.in);
    }

    public String getUserFullName() {
        System.out.println("Введите ФИО на латинице (пример: Ivanov Ivan Ivanovich)" + "\n" + "Если у Вас нет отчества, после имени через пробел поставьте звездочку (*)");
        return scanner.nextLine();
    }

    public String getUserPhoneNumber(){
        System.out.println("Введите номер Вашего телефона, без кода страны (+7).");
        return scanner.nextLine();
    }

    public String getUserDateBirth(){
        System.out.println("Введите дату рождения в формате dd.mm.yyyy");
        return scanner.nextLine();
    }

    public String getUserGender(){
        System.out.println("Введите Ваш пол: f-если женский, m-если мужской");
        return scanner.nextLine();
    }

    public String getUserAnswer(){
        System.out.println("Хотите считать один из файлов? Если да - введите 1, если нет - 0");
        return scanner.nextLine();
}

public String getUserReaderName(){
    System.out.println("Введите фамилию пользователя на латинице");
    return scanner.nextLine();
}
}
