package JavaCore1.module1.sptint3.theme16.task1608;

// Ограничьте класс ContactBook так, чтобы он могу хранить в себе только список контактов
public class ContactBook ... {
        // Объявите поле класса contacts - список контактов книги
        ...

public void addContact(... contact) {
        contacts.add(contact);
        }

public void printList() {
        // Выведите на экран весь список контактов книги
        ...
        System.out.println("Имя: " + contact.getName());
        contact.print();
        }

public void congratulate(String name) {
        boolean contactPresented = false; //проверяем есть ли контакт в базе
        // Найдите контакт в книге по имени, и отправьте ему сообщение с помощью метода sendMessage()
        ...
        System.out.println("Поздравим с Новым годом ваш контакт из записной книжки: " + name);
        contact.sendMessage();

        // Если контакт не найден, выведите соответсвующее сообщение
        System.out.println("Не найден контакт с указанным именем.");
        }

        }
