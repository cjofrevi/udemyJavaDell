public class LengthLastWord {

     static public int lengthOfLastWord(String s) {

//        for( int i = s.length()-1; i >= 0; i--){
//
//            if (s.charAt(i) == ' ' ){
//                System.out.println(i);
//                return s.length()-1 - i;
//            }
//            else if (i == 0){
//                return 1;
//            }
//        }
         s = s.trim();
        return s.length()-1- s.lastIndexOf(" ");
    }

    public static void main(String[] args) {

        String s = "a ll rtrtrt";
        System.out.println(lengthOfLastWord(s));

    }

}
