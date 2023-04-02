
public class TrianglePattern {
    public static void halfPyramid(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid(int n) {
        for(int i=n;i>=1;i--) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void rotatedInvertHalfPyramid(int n) {
        for(int i=n-1;i>=1;i--) {
            //for printing space
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            // for printing *
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        halfPyramid(5);
        System.out.println();
        invertedHalfPyramid(5);
        rotatedInvertHalfPyramid(5);
    }
}
