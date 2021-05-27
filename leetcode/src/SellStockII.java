public class SellStockII {

    static int maxProfit(int[] prices) {

        int index = 1;
        int profit = 0;
        int buyindex =0 ;
        int length = prices.length -2;
//        System.out.println(length);

        while( index < length ){
            System.out.println("while");
            if (prices[buyindex] <= prices[index] ){
                buyindex = index;
                System.out.println("if");

            }
            else if (prices[index] > prices[buyindex] ){
                profit = prices[index] - prices[buyindex];
                index++;
                System.out.println("else if");
            }
            index++;

        }
        System.out.println(index);
        return profit;
    }

    public static void main(String[] args){

       int prices[] = {7,1,5,3,6,4};
       System.out.println(maxProfit(prices));
//        int count =0;
//       while(true){
//            if( count >= 9){
//                System.out.println(count);
//                break;
//            }
//           count++;
//       }

    }
}
