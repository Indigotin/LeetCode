package Array;

import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){

                int index = map.get(nums[i]);
                index++;
                map.put(nums[i],index);
            }else{
                map.put(nums[i],1);
            }
        }
        int max = 0;
        int result = 0;
        for(Map.Entry<Integer,Integer> cur : map.entrySet()){
            if(max < cur.getValue()){
                max = cur.getValue();
                result = cur.getKey();
            }
        }
        return result;
    }
    public static void main(String[] args){
        majorityElement test = new majorityElement();
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(test.majorityElement(nums));
    }
}
