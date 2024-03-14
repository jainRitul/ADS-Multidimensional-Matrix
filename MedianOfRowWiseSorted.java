import java.util.Arrays;

class MedianOfRowWiseSorted {
    public static void main(String[] args) {
        int mat[][] = {{1,10,20},
                        {15,25,35},
                        {5,30,40}};
    //    System.out.print(median(mat));    
       System.out.print(medianEfficient(mat,mat.length,mat[0].length));    
    }
    static int medianEfficient(int mat[][],int r,int c){
   
        int min = mat[0][0],max = mat[0][c-1];

        for(int i = 1;i<r;i++){
            min = Math.min(min,mat[i][0]);
            max = Math.max(max,mat[i][c-1]);
        }
        int medPos = (r*c+1)/2;

        while(min < max){
            int mid = (min + max )/2;
            int midPos = 0;
            for(int i =0;i<r;i++) {
                int pos = Arrays.binarySearch(mat[i],mid) + 1;
                midPos += Math.abs(pos);
            }
            if(midPos < medPos) min = mid+1;
            else max= mid;
              
        }
        return min;
    }
    static int median(int mat[][]){
        int r = mat.length;
        int c = mat[0].length;
        int k = 0;
        int temp[] = new int[r*c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                temp[k] = mat[i][j];
                k++;  
            }
        }
        Arrays.sort(temp);
        return temp[(r*c)/2];
    }
              
}

