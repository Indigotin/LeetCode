package Array;

import java.util.ArrayList;
import java.util.List;

//找到下标与元素之间的关系
public class findDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for(int i=1;i<=nums.length;i++){
            list.add(i);
        }
        for(int i=0;i<nums.length;i++){
            list.set(nums[i]-1,-1);
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)==-1){
                list.remove(i);
                i--;
            }
        }
        return list;
    }
    public static void main(String[] args){
        findDisappearedNumbers test = new findDisappearedNumbers();
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(test.findDisappearedNumbers(nums));
    }
}
