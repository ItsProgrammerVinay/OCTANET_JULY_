public class Recursion {
  public static void main(String[] args) {
    // System.out.println(pow(5, 5)); //O(q)
    // System.out.println(powOptmised(5, 3));//O(logq)
    // System.out.println(sumOfDigit(1245));
    // System.out.println(countOfDigits(543));
    System.out.println(fact(5));
  }

  static int powOptmised(int p, int q) {
    if (q <= 0) {
      return 1;
    }

    int smallpow = powOptmised(p, q / 2);
    if (q % 2 == 0) {
      return smallpow * smallpow;
    }
    return smallpow * smallpow * p;
  }

  static int pow(int p, int q) {
    if (q <= 0) {
      return 1;
    }
    return pow(p, q - 1) * p;

  }

  static int sumOfDigit(int n) {
    if (n >= 0 && n < 10) {
      return n;
    }
    int ans = sumOfDigit(n / 10);
    return ans + n % 10;

  }

  static int countOfDigits(int n) {
    if (n >= 0 && n < 10) {
      return 1;
    }

    int count = 1;
    return countOfDigits(n / 10) + count;
  }

  static int fact(int n) {
    if (n == 0 || n == 1) {
      return n;

    }
    return fact(n - 1) * n;

  }
}