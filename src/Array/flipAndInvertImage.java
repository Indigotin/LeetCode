package Array;

public class flipAndInvertImage {

    public int[][] flipAndInvertImage(int[][] A) {
        int temp;
        for(int i=0;i<A.length;i++){
            int count = A[i].length-1;
            for(int j=0;j<A[i].length;j++){
                if(count >= j){
                    temp = A[i][j];
                    System.out.println("temp="+temp);
                    A[i][j] = A[i][count];
                    A[i][count] = temp;
                    count--;
                }

            }
        }

        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){

                if(A[i][j] == 0)
                    A[i][j] = 1;
                else
                    A[i][j] = 0;
            }
        }

        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){

               System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        return A;
    }
    public static void main(String[] args){
        flipAndInvertImage test = new flipAndInvertImage();
        int[][] A = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        System.out.println(test.flipAndInvertImage(A));
    }
}
