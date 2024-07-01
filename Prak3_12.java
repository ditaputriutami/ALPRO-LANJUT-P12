public class Prak3_12{
	//method rekursif
	public static long faktorial( long N ){
		if ( N <= 1 ){ // kondisi terpenuhi untuk akhir rekursif
			return 1; // nilai akhir: 0! = 1 dan 1! = 1
      } else{
            long hasil = N * faktorial(N - 1);
            System.out.println("Faktorial " + N + " = " + hasil);
            return hasil;
        }
	}

    public static void main(String[] args) {
        // Calling the factorial method

        faktorial(5);
    }
}
