class SearchInRowWiseAndColWiseSortedMatrix {
    public static void main(String[] args) {
        int mat[][] = {{1,2,3},
                       {10,13,19},
                       {33,34,35}};

        search(mat,334);                
        searchEfficient(mat,0);                
    }
    static void searchEfficient(int mat[][],int x){
        int r = mat.length;
        int c = mat[0].length;
        int i = 0,j = c-1;
        while( i < r && j>=0){
            if(mat[i][j] == x){ System.out.print("fount at ( " + i  + "," + j + " )");return;}
            else if(mat[i][j] > x) j--;
            else i++;
        }System.out.print("not found");

    }
    static void search(int mat[][],int x){
        int r = mat.length;
        int c = mat[0].length;

        for(int i = 0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j] == x)
                  System.out.println("fount at  ( " +i+"," +j +")");
                   return;
            }
        }
        System.out.print("not found");
        
    }
}
