package hw4_2;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "123456");
        phoneBook.add("Петров", "234567");
        phoneBook.add("Сидоров", "345678");
        phoneBook.add("Иванов", "456789");

        System.out.println(phoneBook.get("Иванов"));
        // Выводит: [123456, 456789]

        System.out.println(phoneBook.get("Петров"));
        // Выводит: [234567]

        System.out.println(phoneBook.get("Сидоров"));
        // Выводит: [345678]

        System.out.println(phoneBook.get("Кузнецов"));
        // Выводит: []
    }
}