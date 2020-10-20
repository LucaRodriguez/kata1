
package kata1;

import java.time.LocalDate;
import java.time.Month;
/**
 *
 * @author Luca Ian Rodríguez Moreno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person = new Person("Alejandro Lezcano", LocalDate.of(1970, Month.MARCH, 29));
        System.out.println(person.getName() + " " + person.getAge());
    }
    
}
