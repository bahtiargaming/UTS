package gree.simple_fun11_swap_adjacent_bits;

public class Kata {
      public static int swapAdjacentBits(int n) {
        // Melakukan operasi bitwise untuk menukar bit-bit yang berdekatan
        return ((n & 0xAAAAAAAA) >>> 1) | ((n & 0x55555555) << 1);
    }
    
    // Method main untuk menjalankan program di NetBeans
    public static void main(String[] args) {
        // Memeriksa hasil fungsi swapAdjacentBits dengan masukan yang telah diberikan
        System.out.println("For n = 13: " + swapAdjacentBits(13));
        System.out.println("For n = 74: " + swapAdjacentBits(74));
        System.out.println("For n = 1073741823: " + swapAdjacentBits(1073741823));
        System.out.println("For n = 0: " + swapAdjacentBits(0));
        System.out.println("For n = 1: " + swapAdjacentBits(1));
        System.out.println("For n = 83748: " + swapAdjacentBits(83748));
    }
}
