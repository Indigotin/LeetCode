package jianzhiOffer;


/**
 * Created by Len on 2019-03-24
 */
public class InversePairs {

    private int count = 0;

    public int[] mergeSort(int[] array,int left,int right) {
        if(left < right){
            int mid = (left+right)/2;
            mergeSort(array,left,mid);
            mergeSort(array,mid+1,right);
            merge(array,left,mid,right);
        }
        return  array;
    }

    public int InversePairs(int[] array) {
        array = mergeSort(array,0,array.length-1);
        /*for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }*/
        return count%1000000007;
    }

    private void merge(int[] array,int left,int mid,int right){

        int[] temp = new int[right-left+1];
        /*int index1 = left;
        int index2 = mid+1;
        int index3 = 0;
        while(index1 <= mid && index2 <= right){
            if(array[index1] <= array[index2]){
                temp[index3++] = array[index1++];
            }else{
                count += (index2-mid);
                temp[index3++] = array[index2++];
            }
        }
        while (index1<=mid){
            temp[index3++] = array[index1++];
        }
        while (index2<=right){
            temp[index3++] = array[index2++];
        }*/
        int t = right - left;//临时数组下标
        int l = mid;
        int r = right;
        while (l >= left && r >= mid + 1) {
            if (array[l] > array[r]) {
                count += (r - mid);
                temp[t--] = array[l--];
                if (count >= 1000000007) {
                    count %= 1000000007;
                }
            } else {
                temp[t--] = array[r--];
            }
        }
        while (l >= left) {
            temp[t--] = array[l--];
        }
        while (r >= mid + 1) {
            temp[t--] = array[r--];
        }
        for(int i=0;i<temp.length;i++){
            array[left+i] = temp[i];
        }

    }

    public static void main(String[] args){
        InversePairs test = new InversePairs();
        int[] array = {1,2,3,4,5,6,7,0};
        System.out.println(test.InversePairs(array));
    }
}
