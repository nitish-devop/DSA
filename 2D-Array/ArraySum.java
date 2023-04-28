

public class ArraySum {
    public static int getFirstDiagonalSum(int[][] arr){
        int sum = 0;
        int row=0,col=0;
        
        while(row<arr.length && col<arr[0].length){
            sum += arr[row][col];
            row++;
            col++;
        }
        return sum;
    }

    public static int getSecondDiagonalSum(int[][] arr){
        int sum = 0;
        int row=0,col=arr[0].length-1;
        
        while(row<arr.length && col>=0){
            sum += arr[row][col];
            row++;
            col--;
        }
        return sum;
    }
    public static int getBoundarySum(int[][] arr){
        int sum = 0;
        for(int i=0;i<arr.length-1;i++){

            sum += arr[0][i]; //first row sum
            sum += arr[i][arr.length-1]; // last col sum
            sum += arr[i][0]; // first col sum
            sum += arr[arr.length-1][i]; //last row sum

        }
        return sum;
    }

    public static void waveprint(int[][] arr){
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {0,8,9}
        };
        waveprint(arr);
    }
}
