package homework3;
import java.util.*;
/* @author Mitchell */
public class Homework3 {
    public static void main(String[] args) {
        Homework3 app = new Homework3();
        app.run();
    }
    void run() {
        ArrayList list = new ArrayList( );
        list.add( 2 );
        list.add( 7 );
        list.add( 4 );
        list.add( 8 );
        list.add( 5 );
        list.add( 7 );
        list.add( 3 );
        list.get( 0 );
        list.remove( 2 );
        Iterator it = list.iterator( );
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Size of list: " + list.size());
        Collections.sort(list);
    }
    
}
