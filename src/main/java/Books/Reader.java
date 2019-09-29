import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Flow;

public class Reader  implements Flow.Subscriber {
    private Flow.Subscription subscription;
    public List<String> ReadBooks = new LinkedList<>();

    public void onSubscribe(Flow.Subscription subscription) {
        System.out.println("Got here");
        this.subscription = subscription;
        subscription.request(1);
    }

    public void onNext(Object item) {
        System.out.println("Got : " + item);
        //TODO: For some reason, the run flakes out here and doesn't add anything. However, if I run with coverage, it does work.
        subscription.request(1);

    }

    public void onError(Throwable throwable) {
            throwable.printStackTrace();
    }

    public void onComplete() {
            System.out.println("Done");
    }
}
