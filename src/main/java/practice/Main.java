package practice;

import practice.EmailList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmailList emailList = new EmailList();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }

            String command = input.substring(0, 4);
            String email = input.substring(4);

            switch (command) {
                case "ADD " -> emailList.add(email);
                case "LIST" -> System.out.println(emailList.getSortedEmails());
                default -> System.out.println("Введена неверная команда");
            }
        }
    }
}
