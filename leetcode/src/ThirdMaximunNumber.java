import java.util.Arrays;

public class ThirdMaximunNumber {

    public static int thirdMax(int[] nums) {

        Arrays.sort(nums);

        int  count = 1;
        int i = nums.length -1;

        while(i > 0 && count<3){

            if(nums[i] != nums[i-1]){
                count++;
            }
            i--;
        }

        return count == 3 ? nums[i] : nums[nums.length-1] ;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(thirdMax(nums));

    }


}
