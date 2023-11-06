//Thread class
import java.lang.Thread;

class Main{
    public static void main(String[] args) {
        Thread t1 = new CounterThread("Thread 1", 5);
        Thread t2 = new CounterThread("Thread 2", 10);

        t1.start();
        t2.start();
    }
}

class CounterThread extends Thread{
    private String name;
    private int initialCount = 0;
    CounterThread(String name, int initialCount){
        this.name = name;
        this.initialCount = initialCount;
    }

    @Override
    public void run(){
        for(int i = 0; i < 4; i++){
            System.out.println(name+" Counter count : "+ (i + initialCount));
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}