package T;

import java.util.Scanner;

/**
 * Created by Len on 2019-03-23
 */
public class FlipSequence {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        long m = input.nextLong();
        long total = 0;
        int index = 0;
        boolean flag = false;
        for(int i=1;i<=n;i++){
            if(flag == false){
                total -= i;
            }
            else{
                total += i;
            }
            index++;
            if(index == m){
                flag = !flag;
                index = 0;
            }
        }
        System.out.println(total);
    }
}
