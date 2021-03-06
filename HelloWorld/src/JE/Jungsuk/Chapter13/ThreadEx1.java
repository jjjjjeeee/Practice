package JE.Jungsuk.Chapter13;

public class ThreadEx1 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r); // 생성자 thread(runnable target)

        t1.start();
        t2.start();
    }
}

class ThreadEx1_1 extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(getName()); // 조상인 thread의 getName()을 호출
        }
    }
}

class ThreadEx1_2 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()); // 조상인 thread의 getName()을 호출
        }
    }
}
