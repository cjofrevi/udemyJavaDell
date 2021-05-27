import java.util.Arrays;

public class MajorityElement {



    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        int count = 0;
        int output = 0;
        int index = 0;
        int countMax = 0;

        while(count < nums.length){

            if (nums[index] == nums[count]){
                countMax++;
            }else{

            }
            count++;
        }

        return 0;
    }

    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};
        Arrays.sort(nums);

        System.out.println(majorityElement(nums));
        System.out.println("***!");
        for (int x: nums){
            System.out.println(x);
        }
    }
}
