public class FindMaxConsecutives {
    public static int findMaxConsecutiveOnes(int[] nums) {

        int output =0;
        int i = 0;
        while(i < nums.length-1 ){
            int count = 0;
            while(nums[i] == 1  && i <nums.length+1 ){
//                if(nums[i] == 0  && nums[i] == 0 ){
//                    break;
//                }
                count++;
                i++;
            }
            if(count > output){
                output = count;
            }else{
                i++;
            }
        }
        return output ;
    }

    public static void main(String[] args) {

        int[] nums = {1};


        System.out.println(findMaxConsecutiveOnes(nums));

    }
}
