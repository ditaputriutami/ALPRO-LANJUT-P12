public class Tugas1_12 {
   static boolean isPalindrome(String str){
      if (str.length() <= 1)
         return true;
      else
            return str.charAt(0) == str.charAt(str.length() - 1) && isPalindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        String[] str = {"radar", "makam", "bogor", "jakarta"};
        for (String testString : str) {
            boolean isPal = isPalindrome(testString);
            System.out.println(testString + " is Palindrome: " + isPal);
        }
    }
}


