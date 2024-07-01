public class Lat1_12 {
    public static long pangkat(long A, long B) {
        if (B == 0) {
            return 1;
        } else {
            return A * pangkat(A, B - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Hasil = " +pangkat(5,2));
	}
}