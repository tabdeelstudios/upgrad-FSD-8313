class MyThread1 extends Thread{
    public void run(){
        int i=0;
        for(i=0;i<10;i++){
            System.out.println("Current value of i:"+i);
        }
    }
}

class MyThread2 extends Thread{
    public void run(){
        int j=10;
        for(j=10;j>0;j--){
            System.out.println("Current value of j:"+j);
        }
    }
}

public class ThreadsDemo {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}