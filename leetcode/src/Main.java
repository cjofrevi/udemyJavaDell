import java.util.ArrayList;
import java.util.List;

public class Main {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;
                    return output;

                }
            }
        }

        return output;
    }
//    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> output = new ArrayList<List<Integer>>();
//        List<Integer> list = new ArrayList<Integer>();
//
//
//
//        return;

//    }
        static long factorial(int n) {
            if (n ==0){
                return 1;
            }

            if (n <= 2) {
                return n;
            }
            return n * factorial(n - 1);
        }


    public static void main(String[] args) {
//        String palin = String.valueOf(1221);
//        int length = palin.length();
//        for(int i = 0; i <length-1; i++) {
//            if (palin.charAt(i) != palin.charAt(length-1-i)){
//                System.out.println(false);
//                break;
//            }
//        }
//        System.out.println(true);


//        int target = 3;
//        List<List<Integer>> output = new ArrayList<List<Integer>>();
//
//        List<Integer> inner = new ArrayList<Integer>();
//        for(int i = 0; i< target; i++) {
//            List<Integer> inner = new ArrayList<Integer>();
//            int count = 0;
//            while(count <= target){
//                if(count == 0 || count ==i){
//                    inner.add(1);
//                }else{
//                    inner.add(output.get(i-1).get(count-1)+output.get(i-1).get(count));
//                }
//
//                count++;
//            }
//            output.add(inner);
//        }
//        System.out.println(inner);

        int target = 3;
        List<Integer> inner = new ArrayList<Integer>();

       }

    }


