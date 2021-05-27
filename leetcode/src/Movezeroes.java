public class Movezeroes {
    public static void moveZeroes(int[] nums) {

        int i = nums.length - 1;
        int len = nums.length - 1;
        while( i >= 0){
//            System.out.println(nums[i]);
            if (nums[i] == 0) {
                int j = i;
                while (j <= len - 1) {
                    if (nums[j] == 0 && nums[j + 1] != 0) {
                        nums[j] = nums[j + 1];
                        nums[j + 1] = 0;
                        j++;
                    } else {
                        break;
                    }

                }
            }
            i--;


        }

    }

    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        for(int x: nums){
            System.out.println(x);
        }
    }
}
