package jianzhiOffer;


/**
 * Created by Len on 2019-03-25
 */
public class Find {
    public boolean Find(int target, int [][] array) {
        for(int i=0;i<array.length;i++){
            if(search(target,array[i],0,array[i].length-1)){
                return true;
            }
        }
        return false;
    }

    private boolean search(int target,int[] array,int low,int high){

        while(low <= high){
            int mid = (low+high)/2;
            if(array[mid] == target){
                return true;
            }else if(array[mid] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Find test = new Find();
        int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(test.Find(1,array));
    }
}
