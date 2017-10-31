/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.ArrayList;

/**
 *
 * @author Mitchell
 */
public class Streams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Streams app = new Streams();
        app.run();
    }
    
    void run() throws Exception {
        ArrayList < Tweet > tweets = makeTweets(10);
        tweets.forEach(
                tweet -> {
                    System.out.println(tweet);
                }
        );
        
        tweets.parallelStream().forEach(tweet -> {
                    System.out.println(tweet);
                });
        
        tweets.parallelStream().filter(tweet ->
            Integer.parseInt(tweet.user.substring(tweet.user.length()-1)) %2 ==0)
                .forEach(tweet -> {
                    System.out.println(tweet);
                });
            //mapToInt
    }
    
    void makeTweets(int n) {
        ArrayList < Tweet > tweets = new ArrayList < Tweet > ();
        
        for (int i=0; i<n; ++i) {
            tweets.add(new Tweet("user # " + i, "message # " + i));
        }
}
    