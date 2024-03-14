class SpiralTraversalOfMatrix {
    public static void main(String[] args) {
        int mat[][] = {{1},{2},{3},{4}};
        int r = mat.length;
        int c = mat[0].length;
        spiralTraversal(mat,r,c);               
    }
    static void spiralTraversal(int mat[][],int r,int c){
        int top = 0,left =0,right=c-1,bottom = r-1;
        
        while(top <= bottom && left<=right){

            for(int i = left;i<=right;i++)
                System.out.print(mat[top][i] + " ");
            top++;

            for(int i = top ;i<=bottom;i++)
                System.out.print(mat[i][right] + " ");
            right--;
            if(top<=bottom)
            for(int i =right ;i>=left;i--)
                System.out.print(mat[bottom][i] + " ");
            bottom--;
            if(left<=right)
            for(int i = bottom;i>=top;i--)
                System.out.print(mat[i][left]+" ");
            left++; 

        }

    }
}
