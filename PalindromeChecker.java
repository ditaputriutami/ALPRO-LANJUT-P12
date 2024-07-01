public class PalindromeChecker {

    public static boolean testPalindrome(String str) {
        // Mengubah string ke lowercase dan menghapus spasi serta tanda baca
        str = str.toLowerCase().replaceAll("[^a-z]", "");

        // Memanggil metode rekursif untuk mengecek palindrom
        return isPalindromeRecursive(str);
    }

    private static boolean isPalindromeRecursive(String str) {
        // Base case: string kosong atau hanya satu karakter
        if (str.length() <= 1) {
            return true;
        } else {
            // Bandingkan karakter pertama dan terakhir
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);

            if (firstChar == lastChar) {
                // Jika sama, panggil rekursif untuk sisa substring di antara
                String middle = str.substring(1, str.length() - 1);
                return isPalindromeRecursive(middle);
            } else {
                // Jika tidak sama, bukan palindrom
                return false;
            }
        }
    }

    public static void main(String[] args) {
        // Contoh penggunaan:
        String str1 = "radar";
        String str2 = "A man, a plan, a canal, Panama!";
        String str3 = "hello";

        System.out.println(str1 + " is palindrome: " + testPalindrome(str1)); // true
        System.out.println(str2 + " is palindrome: " + testPalindrome(str2)); // true
        System.out.println(str3 + " is palindrome: " + testPalindrome(str3)); // false
    }
}
