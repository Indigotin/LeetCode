
public class hammingDistance {
    public int hammingDistance(int x, int y) {
        int[] x1 = new int[31];
        int[] y1 = new int[31];
        int xP = 30;
        while(x != 0){
            int temp = x % 2;
            x1[xP] = temp;
            xP--;
            x = x/2;
        }

        int yP = 30;
        while(y != 0){
            int temp = y % 2;
            y1[yP] = temp;
            yP--;
            y = y/2;
        }
        int count = 0;
        for(int i=0;i<31;i++){
            if(x1[i] != y1[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        hammingDistance test = new hammingDistance();
        System.out.println(test.hammingDistance(1,4));
    }
}
