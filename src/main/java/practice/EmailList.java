package practice;

import java.util.*;

public class EmailList {
    private TreeSet<String> emailList = new TreeSet<>();
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    public static final String WRONG_CONTAINS_EMAIL_ANSWER = "Такой email уже существует";


    public void add(String email) {
        boolean isValidEmail = email.matches("[^@\\s]+@[^.][^@\\s]+\\.[^@\\s]+");
        email = email.toLowerCase();
        if (emailList.contains(email)) {
            System.out.println(WRONG_CONTAINS_EMAIL_ANSWER);
        } else if (isValidEmail && !emailList.contains(email)) {
            emailList.add(email);
        } else {
            System.out.println(WRONG_EMAIL_ANSWER);
        }

    }

    public List<String> getSortedEmails() {
        //возвращается сортированный список электронных адресов в алфавитном порядке
        List<String> sortedList = new ArrayList<>(emailList);
        Arrays.sort(new List[]{sortedList});
        return sortedList;
    }

}
