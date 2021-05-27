import java.util.Arrays;

public class ArrayPartitionI {

    public static int arrayPairSum(int[] nums) {

        Arrays.sort(nums);
        int output = 0;

        for(int i = 0; i< nums.length-1; i +=2){
            output += Math.min(nums[i], nums[i+1]);
        }



        return output;
    }

    public static void main(String[] args) {

        int[] nums = {1,4,3,2};
//        for(int i = 0; i< nums.length-1; i +=2){
//            System.out.println(nums[i]+" "+nums[i+1]);
//        }
        System.out.println(arrayPairSum(nums));
    }
}
