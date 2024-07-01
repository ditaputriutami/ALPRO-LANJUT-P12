public class Tugas2_13 {
   static boolean isPalindrome(String str) {
      int left = 0;
      int right = str.length() - 1;

      while (left < right) {
         if (str.charAt(left) != str.charAt(right)) {
            return false;
         }
         left++;
         right--;
      }
      return true;
   }

   public static void main(String[] args) {
      String[] str = {"radar", "makam", "bogor", "jakarta"};
      for (String testString : str) {
         boolean isPal = isPalindrome(testString);
         System.out.println(testString + " is Palindrome: " + isPal);
      }
   }
}
