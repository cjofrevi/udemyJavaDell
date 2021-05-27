public class ReshapeMatrix {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        if(r*c != mat.length * mat[0].length){
            return mat;
        }

        int[] temp = new int[mat.length * mat[0].length ];

        int count = 0;
        for(int i =0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                temp[count] = mat[i][j];
                count++;
            }
        }


        int[][] output = new int[r][c];
        for(int k = 0; k < r; k++){
            for( int l = 0; l < c; l++){
//                System.out.println(c * k + l);
                output[k][l] = temp[c * k + l];
            }
        }

        return output;
    }

    public static void main(String[] args) {

        int [][] mat = {{1,2},{3,4}};
        int r = 2;
        int c = 4;

        int[][] newMat = matrixReshape(mat, r, c);

        for(int[] array: newMat){
            for(int z: array){
                System.out.println(z);
            }
            System.out.println("*");

        }

//        int[][] newMat = new int[1][4];
//        int num =8;
//
//        for(int i=0; i< newMat.length; i++){
//            for(int j = 0; j< newMat[i].length; j++ ){
//                System.out.println(newMat[i][j]);
//            }
//
//            System.out.println("*");
//        }
    }
}
