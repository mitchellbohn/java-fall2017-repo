/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5;

/**
 *
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
        Threads threads = new Threads();
        Parallels parallels = new Parallels();
        Strings strings = new Strings();
        
        System.out.println("Running Threads Demonstration...");
        for (int i = 0; i < 5; ++i) {
                threads.setNum("Num " + i);
                threads.announceBack();
        }
        
        System.out.println("Running Parallels Demonstration...");
        for (int i = 0; i < 5; ++i) {
            synchronized (parallels) {
                parallels.setNum1("Num1: " + i);
                parallels.setNum2("Num2: " + i);
                parallels.announceBack();
            }
        }
        
        System.out.println("Running Strings Demonstration...");
        
        
        System.out.println("done in main.");
    }
}
