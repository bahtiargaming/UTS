package Product_of_consecutive_Fib_numbers;
    public class ProdFib { // must be public for codewars

  public static long[] productFib(long prod) {
    long a = 0;
    long b = 1;
    while (a * b < prod) {
      long temp = a;
      a = b;
      b = temp + b;
    }
    return new long[] { a, b, a * b == prod ? 1 : 0 }; // Use 1 for true and 0 for false
  }

  public static void main(String[] args) {
    // Contoh pengujian
    long prod1 = 714;
    long[] result1 = productFib(prod1);
    System.out.println(result1[0] + ", " + result1[1] + ", " + (result1[2] == 1 ? "true" : "false"));

    long prod2 = 800;
    long[] result2 = productFib(prod2);
    System.out.println(result2[0] + ", " + result2[1] + ", " + (result2[2] == 1 ? "true" : "false"));
  }
}

