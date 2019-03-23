package Array;

public class isMonotonic {


    public boolean isMonotonic(int[] A) {
        boolean flag = false;

        if(A.length == 1)
            return true;

        for(int i=0;i+1<A.length;i++){
            if(A[i] >= A[i+1]){

            }
            else{
                flag = true;
                break;
            }
        }
        if(flag)
            flag = false;
        else
            return !flag;

        for(int i=0;i+1<A.length;i++){
            if(A[i] <= A[i+1]){

            }
            else{
                flag = true;
                break;
            }
        }

        return !flag;
    }

    public static void main(String[] args){
        isMonotonic test = new isMonotonic();
        int[] A = {1,1,0};
        System.out.println(test.isMonotonic(A));
    }
}
