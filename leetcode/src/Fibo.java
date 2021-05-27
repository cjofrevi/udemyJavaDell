public class Fibo {

    public static int Fibonacci(int number){

        int before = 0;
        int after = 1;

        if(number ==0){
            return 0;
        }
        for(int i =1; i < number; i++){
            int temp = after;
            after = after+  before;
            before = temp;
        }

        return after;
    }

    public static void main(String[] args) {

        System.out.println(Fibonacci(1));

    }
}
