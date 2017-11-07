package homework5;

import java.util.ArrayList;

/*
 * @author Mitchell
 */

public class Homework5 {

    String[] args;

    Homework5(String[] _args) {
        args = _args;
    }

    public static void main(String[] args) throws Exception {
        new Homework5(args).run();
    }
    
    void run() throws Exception {
        
        System.out.println("Running Threads Demonstration...");
        Threads threads = new Threads();
        for (int i = 0; i < 25; ++i) {
                threads.setNum("num: " + i);
                threads.announceBack();
        }
        
        System.out.println("Running Streams Demonstration...");
        ArrayList < Streams > streams = makeStreams(25);
        
        streams.forEach(
                stream -> {
                    System.out.println(stream);
                }
        );
        
        streams.parallelStream().forEach(stream -> {
                    System.out.println(stream);
                });
        
        streams.parallelStream().filter(stream -> 
                Integer.parseInt(stream.num1.substring(stream.num1.length()-1)) %2 == 0)
                .forEach(stream -> {
                    System.out.println(stream);
                });
        
        long total = streams.parallelStream().mapToInt(stream->
                Integer.parseInt(stream.num1.substring(stream.num1.length()-1)))
                .sum();
        
        long sum = 0;
        for (Streams stream : streams) {
            int id = Integer.parseInt(stream.num1.substring(stream.num1.length()-1));
            sum += id;
        }
    }
    
    ArrayList < Streams > makeStreams(int n) {
        ArrayList < Streams > streams = new ArrayList <> ();
        
        for (int i=0; i<n; ++i) {
            streams.add(new Streams(" " + i, " " + i));
        }
        return streams;
    }
}
