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
        list.add(2);
        list.add(7);
        list.add(4);
        list.add(8);
        list.add(5);
        list.add(7);
        list.add(3);
        System.out.println("First in the list: " + list.get( 0 ));
        list = sortandmodlist(list);
        System.out.println("list has been updated.");
    }
    public ArrayList sortandmodlist(ArrayList list){
        System.out.println("Current order of list: ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Size of list: " + list.size());
        list.remove( 4 );
        list.remove( 2 );
        list.remove( 0 );
        System.out.println("First, third, and fifth in the ArrayList removed. New size of list: " + list.size());
        Collections.sort(list);
        System.out.println("Sorted order of list: ");
        it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        return list;
    }
}