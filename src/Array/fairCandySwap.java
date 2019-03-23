package Array;

public class fairCandySwap {

    public int[] fairCandySwap(int[] A, int[] B) {

        int sumA = 0;
        for(int i=0;i<A.length;i++){
            sumA += A[i];
        }
        int sumB = 0;
        for(int i=0;i<B.length;i++){
            sumB += B[i];
        }

        int[] temp = new int[2];

        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){

                if(sumA-A[i]+B[j] == sumB-B[j]+A[i]){
                    temp[0] = A[i];
                    temp[1] = B[j];
                    return temp;
                }
            }
        }
        return temp;
    }

    public static void main(String[] args){
        fairCandySwap test = new fairCandySwap();
        int[] A = {1,1};
        int[] B = {2,2};
        int[] temp = test.fairCandySwap(A,B);
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]+" ");
        }

    }

}
