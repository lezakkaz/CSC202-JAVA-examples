import org.w3c.dom.ls.LSOutput;

public class MultiThreadingExample extends Thread{
    String threadName;

    public Main(String threadName){
        this.threadName = threadName;
        System.out.println("Thread " + this.threadName + " has been created.");
    }

    @Override
    public void run(){
        System.out.println("Thread " + this.threadName + " is running.");
        for(int i=0; i<5; i++){
            System.out.println(this.threadName + " - " + Integer.toString(i) );
        }
        System.out.println("Thread " + this.threadName + " has finished running.");
    }

    public static void main(String[] args) {
        Main t1 = new Main("T1");
        Main t2 = new Main("T2");

        t1.start();
        t2.start();

    }
}
