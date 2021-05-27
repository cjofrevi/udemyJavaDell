import java.util.ArrayList;
import java.util.List;

public class FindNumber {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        int[] array = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            if(array[nums[i]-1]==0){
                array[nums[i]-1]= 1;
            }
        }

        List<Integer> result = new ArrayList<Integer>();
        for(int j =0; j < array.length; j++){
            if(array[j]==0){
                result.add(j+1);
            }
        }

        return result;

    }

    public static void main(String[] args) {

//        int[] nums = new int[5];
//        for(int x : nums){
//            System.out.println(x);
//        }
        int [] nums = {1,1};
//        System.out.println(nums.length);

        System.out.println(findDisappearedNumbers(nums));

    }
}
