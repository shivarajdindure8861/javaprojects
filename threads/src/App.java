import com.axis.itc.GrammerCheck;
import com.axis.itc.ImpData;
import com.axis.itc.SpellChecker;
import com.threads.ExcelReaderTask;
import com.threads.ThreadOne;
import com.threads.ThreadTwo;

public class App {

    public void demo1() {
        ThreadOne to = new ThreadOne();
        to.start();

        Runnable task1 = new ThreadTwo();
        Thread t1 = new Thread(task1);
        t1.start();

        Runnable task2 = new ExcelReaderTask();
        Thread t2 = new Thread(task2);
        t2.start();
    }

    public void demo2() {

        ImpData dt = new ImpData();

        Runnable task1 = new SpellChecker(dt);
        Thread t1 = new Thread(task1);

        Runnable task2 = new GrammerCheck(dt);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("There is a problem");
        }

        dt.currentCount();

    }

    public static void main(String[] args) throws Exception {
        System.out.println("Threading");
        App ap = new App();
        ap.demo2();
        ap.demo1();
    }
}
