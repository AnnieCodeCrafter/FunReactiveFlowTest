import java.util.List;

public class FUNmain {

    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Reader reader = new Reader();
        publisher.subscribe(reader);
        List<String> Books = List.of("Hello", "Goodbye" );
        String Book1 = "Boo";


        if(publisher.getNumberOfSubscribers() > 0) {
            System.out.println(publisher.getNumberOfSubscribers() + " subs!");
            //Books.forEach(publisher::submit);
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
