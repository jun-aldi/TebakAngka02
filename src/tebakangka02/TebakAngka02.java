package tebakangka02;

public class TebakAngka02 {
    //method        
    public static void main(String[] args) {
            RandomAngka02 t1 = new RandomAngka02();
            //acak angka dari 0-100
            t1.acak = (int)(Math.random()*(100-0+1));
            t1.benar=0;
            System.out.println("Hai.. nama saya Mr. Lappie, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d\n" +
"100. Silakan tebak ya!!!");
            System.out.println("");
            t1.tebakAngka();
            t1.skor();
        }
}
