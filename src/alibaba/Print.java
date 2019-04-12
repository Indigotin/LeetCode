package alibaba;

/**
 * Created by Len on 2019-03-25
 */
public class Print implements Runnable{
    private int i;
    public Print(int i){
        this.i = i;
    }

    @Override
    public void run(){
        while(i<=1000){
            method();
        }
    }

    private synchronized void method(){

        if(i<=1000){
            System.out.print(Thread.currentThread().getName()+" :"+i+" ");
            i++;
        }
    }
}
