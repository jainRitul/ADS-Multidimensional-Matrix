class TransposeOfMatrix {
    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}
                       };
        // transpose(mat);
        transposeNaive(mat);
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j] + " ");
            }System.out.println();
        }

    }
    static void transposeNaive(int mat[][]){
        int r = mat.length;
        int c = mat[0].length;

        int temp[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                temp[i][j] = mat[j][i];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j] = temp[i][j];
            }
        }
        
    }
    static void transpose(int mat[][]){
       int r = mat.length;
       int c = mat[0].length;
       
       for(int i=0;i<r;i++){
        for(int j=i+1;j<c;j++){
         
            int temp = mat[i][j];
            mat[i][j] = mat[j][i];
            mat[j][i] = temp;
        }
       }
    }
}
