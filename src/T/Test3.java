package T;

import java.util.Scanner;

/**
 * Created by Len on 2019-03-23
 */
public class Test3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int low = 1;
        int high = M;
        int mid = 0;
        boolean flag = true;
        while(low <= high){

            mid = (low + high+1)/2;
            int sum = sum(mid,N);
            if(sum == M){
                flag = false;
                break;
            }else if(sum > M){
                high = mid-1;

            }else{
                low = mid+1;
            }
        }
        if(flag){
            System.out.println(high);
        }else{
            System.out.println(mid);
        }

    }
    private static int sum(int count,int n){
        int sum = count;
        int total = 0;
        for(int i=0;i<n;i++){
            total += sum;
            sum = (sum+1)/2;
        }
        return total;
    }
}

