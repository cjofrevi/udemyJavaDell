import java.util.ArrayList;
import java.util.List;

public class SumRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> output = new ArrayList<>();
        int i = 0;

        while( i < nums.length-1){
            int j = i ;


            System.out.println("initial"+j);
            System.out.println("length array " + (nums.length-1));
            if(nums[j] != nums[j+1] - 1 || j == nums.length-1){
                output.add(""+nums[i]+"");
                i++;
            }else{
                System.out.println("inside else"+j);
                while(j < nums.length){

                    if(nums[j] == nums[j+1] - 1){

                        System.out.println(j);
                    }else{
                        break;
                    }
                    j++;
                }
                output.add(nums[i]+"->"+nums[j] );
                i = j;
                i++;
                System.out.println(j);
                System.out.println(i);

            }
//            ++;


        }
        return output;
    }


    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};

        System.out.println(summaryRanges(nums));

    }
}
