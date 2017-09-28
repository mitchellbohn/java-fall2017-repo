/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import java.util.Scanner;

/**
 *
 * @author Mitchell
 */
public class Homework2 {
    public static void main(String[] args) throws Exception {
        Homework2 app = new Homework2();
        app.run();
    }
    
    public void run() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a value for the amount of megabytes given each month. (X): ");
        int x = reader.nextInt();
        System.out.println("Enter a value for the number of months the plan has been active. (N): ");
        int n = reader.nextInt();
        int p[] = new int[n];
        for(int f = 0; f < n; f++) {
            System.out.println("Enter a number for the amount of megabytes used for month " + (f+1) + ". (P): ");
            p[f] = reader.nextInt();
        }
        int a = 0;
        for(int f = 0; f < n; f++) {
            a=(x+a)-(p[f]);
        }
        System.out.println(a+x);
    }
}
