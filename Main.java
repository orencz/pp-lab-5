import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;
import company.beans.Person;

public class Main {
    public static void main(String[] args) {
        
        Person[] people = new Person[5];

       
        final int b = 10;

        try {
           
            people[0] = new Person("John Doe", 30);
            people[1] = new Person("Marek Mostowiak", 26);
            people[2] = new Person("Marcin Najman", 25);
            people[3] = new Person("Jerzy Dudek", 22);
            people[4] = new Person("Cristiano Ronaldo", 29);

            
            Messenger messenger = new EmailMessenger();

            
            for (Person person : people) {
                int agePlusB = MathUtils.add(person.getAge(), b);
                messenger.sendMessage(person.getName() + " bedzie mial " + agePlusB + " lat za " + b + " lat.");
            }
        } catch (Exception e) {
            System.out.println("Blad: " + e.getMessage());
        }
    }
}
