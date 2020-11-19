package homework1_2;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Parent {

    protected Logger log;

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    protected String name;

    public Parent(String name) {
        this.name = name;
        this.log = LogManager.getLogger(this.getClass());
        log.debug("New object of Parent class was created!");
    }

    public void method() {
        this.log.info(this.name + ": How Do You do?");
    }

    public void charMethod(List<String> list) {

        try {
            String[] myArray = list.toArray(new String[0]);
            for (String s : myArray) {
                char[] stringToChar = s.toCharArray();
                for (char ch : stringToChar) {
                    this.log.debug(ch + " ");
                }
            }
        } catch (NullPointerException e) {
            this.log.log(Level.ERROR,"My ERROR! An array is not defined. Please check the correctness of the entered values!",e);
        } catch (Exception e){
            this.log.error("Another Error!",e);
        }

    }

}
