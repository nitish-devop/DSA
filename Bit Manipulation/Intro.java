

public class Intro {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;

        System.out.println("OR : "+(x | y));
        System.out.println("AND : "+(x & y));
        System.out.println("XOR : "+(x ^ y));
        System.out.println("~ : "+(~x));

        int get3rdBit = ((x & 1<<4 )> 0) ? 1 : 0;
        System.out.println(get3rdBit);


        int set3rdBit = 2 | 1<<2;
        System.out.println(set3rdBit);

        int clear2Bit = 15 & ~(1<<2);
        System.out.println(clear2Bit);

        // Print binary of a number 
        System.out.println(Integer.toBinaryString(16 & (-16)));
    }
}
