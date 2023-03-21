import com.axis.thread.itc.ItcHub;
import com.axis.thread.itc.NumConsumer;
import com.axis.thread.itc.NumProducer;

public class App {
    public static void demo3() {

        ItcHub hub = new ItcHub();

        Runnable consumer = new NumConsumer(hub);// upcasting
        Thread t2 = new Thread(consumer);

        Runnable producer = new NumProducer(hub);
        Thread t1 = new Thread(producer);

        t2.start();
        t1.start();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        demo3();
    }
}
