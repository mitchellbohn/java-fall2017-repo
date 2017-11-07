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
public class Parallels {
    private class Task implements Runnable {
        
        private String num1, num2;
        
        Task() {
            this.num1 = Parallels.this.num1;
            this.num2 = Parallels.this.num2;
        }
        
        void announce() {
            System.out.println("Parallels demonstration announced " + num1 + " with " + num2);
        }
        
        @Override
        public void run() {
            announce();
        }
    }
    
    private String num1, num2;
    
    public void setNum1(String _num1) {
        num1 = _num1;
    }
    
    public void setNum2(String _num2) {
        num2 = _num2;
    }
    
    public void announceFront() {
        new Task().announce();
    }

    public void announceBack() {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();
    }
    
    public void announceFrontSync(String num1, String num2) {
        synchronized (this) {
            setNum1(num1);
            setNum2(num2);
            announceFront();
        }
    }
    public void announceBackSync(String num1, String num2) {
        synchronized (this) {
            setNum1(num1);
            setNum2(num2);
            announceBack();
        }
    }
}
