package Array;

public class sortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int[] B = new int[A.length];
        int start = 0;
        int end = A.length-1;
        for(int i=0;i<A.length;i++){
            if(A[i]%2 == 0){
                B[start] = A[i];
                start++;
            }
            else{
                B[end] = A[i];
                end--;
            }
        }
        return B;
    }
}
