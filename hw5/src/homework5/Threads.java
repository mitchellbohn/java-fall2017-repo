package homework5;

/*
 * @author Mitchell
 */

public class Threads {
    
    private class Task implements Runnable {
        
        private String num;
        
        Task() {
            this.num = Threads.this.num;
        }
        
        void announce() {
            System.out.println("Threads demonstration released " + num);
        }
        
        @Override
        public void run() {
            announce();
        }
    }
    
    private String num;

    public void setNum(String _num) {
        num = _num;
    }

    public void announceFront() {
        new Task().announce();
    }

    public void announceBack() {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();
    }

    public void announceFrontSync(String num) {
        synchronized (this) {
            setNum(num);
            announceFront();
        }
    }

    public void announceBackSync(String num) {
        synchronized (this) {
            setNum(num);
            announceBack();
        }
    }
}
