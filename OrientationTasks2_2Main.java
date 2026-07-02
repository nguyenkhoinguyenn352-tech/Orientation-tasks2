public class Main {

    public static void main(String[] args) {

        EventList list = new EventList();

        list.addEvent(new Event(8.5));
        list.addEvent(new Event(2.1));
        list.addEvent(new Event(5.6));
        list.addEvent(new Event(1.2));

        System.out.println("Next event:");
        System.out.println(list.getNextEvent());

        System.out.println("\nRemaining events:");
        list.printEvents();
    }
}
