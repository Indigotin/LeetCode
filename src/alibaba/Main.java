package alibaba;
/**
 * Created by Len on 2019-03-25
 */
public class Main {

    /*杨辉三角
    public static void main(String[] args){
        int[][] temp = new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<=i;j++){
                if(j == 0 || j == i){
                    temp[i][j] = 1;
                }else{
                    temp[i][j] = temp[i-1][j-1]+temp[i-1][j];
                }
            }
        }

        for(int i=0;i<10;i++){
            for(int j=0;j<=i;j++){
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
    }*/

    public static void main(String[] args){
        Print print = new Print(1);
        Thread t1 = new Thread(print,"一");
        Thread t2 = new Thread(print,"二");
        t1.start();
        t2.start();
    }

}
