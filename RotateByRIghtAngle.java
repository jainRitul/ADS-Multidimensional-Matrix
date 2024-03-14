class RotateByRIghtAngle {
    public static void main(String[] args) {
        int mat[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        // rotateByRIghtAngle(mat);    
        // for(int i=0;i<mat.length;i++){
        //     for(int j=0;j<mat[0].length;j++){
        //         System.out.print(mat[i][j] + " ");
        //     }
        //     System.out.println();
        // }   
                 
        rotateByRIghtAngleEff(mat);    
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }            
    }
    static void rotateByRIghtAngleEff(int mat[][]){
        int n =mat.length;
        for(int i=0;i<n;i++){
            for(int j =i+1;j<n;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++){
            int low = 0;
            int high = n-1;
            while(low < high){
                int temp = mat[low][i];
                mat[low][i] = mat[high][i];
                mat[high][i] = temp;
                low++;
                high--;
            }
        }
    }
    static void rotateByRIghtAngle(int mat[][]){
        int r = mat.length;
        int c = mat[0].length;
        
        int temp[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j =0;j<c;j++){
              
              temp[(c-1)-j][i] = mat[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j] = temp[i][j];
            }

        }
    }
}
