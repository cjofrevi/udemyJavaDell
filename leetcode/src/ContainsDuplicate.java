import java.util.Arrays;

public class ContainsDuplicate {
    public static boolean contdupl(int[] nums){
        Arrays.sort(nums);
        for(int i = 0; i< nums.length-1; i++){
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {

//        for(int i = 0; i< nums.length; i++){
//            for(int j = 0; j)
//        }


        return false;
    }

    public static void main(String[] args) {

//        int[] nums = {1,2,3,4};
        int[] nums = {1,2,3,1,2,3};
        int k = 2;

        System.out.println(contdupl(nums));

    }
}
