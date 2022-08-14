import java.util.*;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()) {
            Person s = queue.poll();
            if (s.isTickets()) {
                System.out.println(s.getName() + " " + s.getSurname() + " has rode the attraction");
                queue.add(s);
            } else {
                System.out.println(s.getName() + " " + s.getSurname() + "," + " you have no tickets, buy else if you want to ride");
            }
        }
    }

    public static List<Person> generateClients() {
        ArrayList<Person> clients = new ArrayList<>();
        clients.add(new Person("Marat", "Samigullin", 3));
        clients.add(new Person("Al'bert", "Trullin", 1));
        clients.add(new Person("Olya", "Ament'eva", 2));
        clients.add(new Person("Olesya", "Orlova", 5));
        clients.add(new Person("Karim", "Birov", 1));
        return clients;
    }
}
