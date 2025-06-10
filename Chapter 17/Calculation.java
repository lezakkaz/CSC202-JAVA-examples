/*
In this example, we create two threads by extending the Thread class directly. The MyThread class represents a thread and overrides the run() method to define the behavior of the thread. Each thread prints its name five times with a 1-second pause between each print using Thread.sleep().

Similar to the previous example, the main thread will also print its own name five times with a 1-second pause between each print. As a result, you'll see interleaved output from the two threads and the main thread.

Note: As with any multithreaded program, the output may vary on different runs due to the scheduling and execution nature of threads.

*/

class Calculation implements Runnable {
    int[] numbers;
    int start;
    int end;
    int sum;

    Calculation(int[] numbers, int start, int end){
        this.numbers=numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for(int i=start; i<end;i++){
            sum+= numbers[i];
        }
    }


}
public class Main{
    public static void main(String[] args) throws InterruptedException {
        int[] numbers = new int[10];
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = i;
        }

        int numberOfThreads = 3;
        Calculation[] workers = new Calculation[numberOfThreads];
        Thread[] threads = new Thread[numberOfThreads];

        int chunkSize = numbers.length / numberOfThreads;

        for(int i = 0; i<numberOfThreads; i++){
            int start = i * chunkSize;
            int end = start + chunkSize;

            if (i==numberOfThreads-1){
                end = numbers.length;
            }
            System.out.println("Thread-"+i+" Start:"+start+" End:"+end);
            workers[i] = new Calculation(numbers, start, end);
            threads[i] = new Thread(workers[i]);
            threads[i].start();

        }

        int total = 0;
        for(int i = 0; i<numberOfThreads; i++){
            threads[i].join();
            total+= workers[i].sum;
        }

        System.out.println("Total Sum: " + total);
    }
}
