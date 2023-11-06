//Runnable interface
import java.lang.Runnable;
import java.lang.Thread;


class Main{
    public static void main(String[] args) {
        Thread t1 = new Thread(new CounterRunnable("Tread 1", 0));
        Thread t2 = new Thread(new CounterRunnable("Tread 2", 10));

        t1.start();
        t2.start();
        
    }
}

class CounterRunnable implements Runnable{
    private String name;
    private int initialCount = 0;
    CounterRunnable(String name, int initialCount){
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