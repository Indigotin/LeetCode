package Array;

public class moveZeroes {

    public void moveZeroes(int[] nums) {

        for(int i=0,j=1;j<nums.length;j++){
            if(nums[i]==0 && nums[j]!=0){
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
            }
            else if(nums[i]!=0){
                i++;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args){
        moveZeroes test = new moveZeroes();
        int[] nums = {1,0,1};
        test.moveZeroes(nums);
    }
}
