package T;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Len on 2019-03-23
 */
public class cardGame {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        //int[] arr = new int[n];
        List<Integer> list = new ArrayList();
        for(int i=0;i<n;i++){
            //arr[i] = input.nextInt();
            list.add(input.nextInt());
        }
        Collections.sort(list);
        Integer total = 0;
        boolean flag = false;
        for(int i=n-1;i>=0;i--){
            if(flag == false){
                total += list.get(i);
            }
            else{
                total -= list.get(i);
            }
            flag = !flag;
        }
        System.out.println(total);
    }
}
