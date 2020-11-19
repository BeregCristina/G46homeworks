package homework1_2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private final static Logger LOG = LogManager.getLogger("THE MAIN CLASS");

    public static void main(String[] args) {
        A objectA = new A();
        B objectB = new B();
        List<String> myList = objectA.firstMethod();
        objectB.secondMethod(myList);

        Parent p = new Parent("John");
        p.method();

        List<String> l = new ArrayList<>();
        l.add("First");
        l.add("Second");
        l.add("Third");
        l.add("Fourth");
        l.add("Fifth");


        objectA.charMethod(null);
        LOG.info("--------------");
        objectB.charMethod(objectA.firstMethod());
        LOG.info("--------------");
        objectB.charMethod(l);

    }
}
