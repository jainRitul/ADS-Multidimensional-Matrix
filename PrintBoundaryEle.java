class PrintBoundaryEle {
    public static void main(String[] args) {
        int mat[][] = {{1,2,5,6},
                        {3,4,5,6},
                     
        };
        printBoundary(mat,2,4);

    }
    static void printBoundary(int mat[][],int r,int c){
        if(r == 1){
            for(int i=0;i<c;i++)
              System.out.print(mat[0][i]+ " ");
            System.out.println();  
        }
        else if(c == 1){
          for(int i = 0;i<r;i++){
            System.out.print(mat[i][0] + " ");
          }
          System.out.println();
        }
        else{
            for(int i=0;i<c;i++){
                System.out.print(mat[0][i]+" ");
            }
            for(int i = 1;i<r;i++){
                System.out.print(mat[i][c-1] + " ");
            }
            for(int i = c-2;i>=0;i--){
                System.out.print(mat[r-1][i]+" ");
            }
            for(int i = r-2;i>0;i--){
                System.out.print(mat[i][0] + " ");
            }
        }
    }
}
