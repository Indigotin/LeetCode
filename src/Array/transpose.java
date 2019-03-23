package Array;

public class transpose {

    public int[][] transpose(int[][] A) {

        int[][] B = new int[A[0].length][A.length];

        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                B[j][i] = A[i][j];
            }
        }
        return B;
    }
    public static void main(String[] args){
        transpose test = new transpose();
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(test.transpose(A));
    }
}
