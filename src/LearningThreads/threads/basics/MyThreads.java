package LearningThreads.threads.basics;

public class MyThreads extends Thread {
    @Override
    public void run() {
        for(int i=1;i<=3 ;i++) {
            System.out.println(i);
            try{
                Thread.sleep(2000);
                System.out.println(i + "I am new Thread ");
            }
            catch(InterruptedException e){

            }
        }
    }

}