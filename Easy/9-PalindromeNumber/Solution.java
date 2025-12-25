class Solution {
  public boolean isPalindrome(int x) {
    if (x < 0)
      return false;
    int tmp = x;
    int result = 0;
    for (; tmp > 0; tmp /= 10) {
      result = (result * 10) + (tmp % 10);
    }
    if (result == x) {
      return true;
    }
    return false;
  }
}
