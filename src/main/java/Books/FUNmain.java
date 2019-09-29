import java.util.List;

public class FUNmain {

    //TODO: Startimg from java 9, the methods for the observer pattern have become deprecated.
    // Therefore, I've used the Reactive Stream pattern, which is in many ways the same and is, in some ways, better.
    // The tutorial I've used for this is here --> https://www.baeldung.com/java-9-reactive-streams


    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Reader reader = new Reader();
        publisher.subscribe(reader);
        List<String> Books = List.of("Hello", "Goodbye" );
        String Book1 = "Boo";


        if(publisher.getNumberOfSubscribers() > 0) {
            System.out.println(publisher.getNumberOfSubscribers() + " subs!");
            Books.forEach(publisher::submit);
            publisher.submit(Book1);
            publisher.close();


            for (String s : reader.ReadBooks) {
                System.out.println("Im here");
                System.out.println(s);
            }


        }

        else {
            System.out.println("No subs??");
        }





    }
}
