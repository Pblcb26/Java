import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {
        
    private HashMap<String, ArrayList<String>> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<>();  
    }

    public void add(String surname, String phone) { 

        if (phonebook.get(surname) == null) {
            ArrayList<String> phones = new ArrayList<>();
            phones.add(phone);
            phonebook.put(surname, phones);
        } else {
            phonebook.get(surname).add(phone);
        }
    }

    public void get(String surname) {
        if (phonebook.get(surname) != null) {
            System.out.println(phonebook.get(surname));
        }
    }
    /*разбор ДЗ
    public ArrayList<String> get(String surname) {
        return phonebook.get(surname);
    }*/

    public void info() {
        System.out.println(phonebook);
    }
}