/**
 * JavaCore. Homework. Lesson 3.
 * @author Afanasyeva MS
 * @version 18.11.2021
 */

import java.util.HashMap;

class HomeWork4 {
    
    public static void main(String[] args) {

        String[] catNames = {"Кусимир", "Мышебор", "Кусихвост", "Втапкисрав", "Жирополк", "Шерстиком", "Яромур", "Втапкисрав", "Ярожор","Жирополк", "Яролиз", "Втапкисрав", "Наглохват", "Кусимир", "Лютодрав", "Мурослав", "Вездессун", "Кусимир", "Втапкисрав"};

        HashMap<String, Integer> equalsCatNames = new HashMap<>();

        for (String catName : catNames) {
            equalsCatNames.put(catName, equalsCatNames.getOrDefault(catName, 0) + 1);
        }

        System.out.println("Уникальные имена:");
        equalsCatNames.forEach((catName, i) -> System.out.print(catName + " "));
        System.out.println("Всего уникальных имен: " + equalsCatNames.size());
        System.out.println("");

        System.out.println(equalsCatNames);
        System.out.println("");
        
        Phonebook phonebook = new Phonebook();

        phonebook.add("Кусакин", "55-06-30");
        phonebook.add("Моськова", "54-43-44");
        phonebook.add("Кусакин", "54-43-44");
        phonebook.add("Элисова", "77-12-03");
        phonebook.add("Клаусов", "77-22-40");
        phonebook.add("Фоксович", "25-02-50");

        phonebook.info();

        phonebook.get("Кусакин");

    }
}