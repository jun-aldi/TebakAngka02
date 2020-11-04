package tebakangka02;

import java.util.Scanner;

public class RandomAngka02 {
            Scanner in = new Scanner(System.in);
        //atribut
            int acak,benar,skor,bonus,jmlh_skor,jmlh_bonus,a_bonus;
        
        //method untuk perulangan tebak angka
        void tebakAngka (){
            //pemberian nilai awal
            jmlh_skor=100;
            a_bonus=0;
            //perulangan
            while (benar !=1 && jmlh_skor >0){
             System.out.print("Tebakan anda: ");
             //atribut dan pemberian nilai
             int a=2;
             int b=1;
             int nilai = in.nextInt();
                 if (nilai > acak){
                   System.out.println("Hehe... Tebakan anda terlalu besar");
                   benar = 0;
                   skor = a--;
                   bonus = b++;
                   jmlh_skor = jmlh_skor-skor;
                   a_bonus= a_bonus + bonus;

               } 
                 else if (nilai < acak){
                 System.out.println("Hehe... Tebakan anda terlalu kecil") ;
                 benar = 0;
                 skor = a--;
                 bonus = b++;
                 jmlh_skor = jmlh_skor-skor;
                 a_bonus= a_bonus + bonus;

               }
                 else {
                   System.out.println("YEEE...Tebakan anda benar");
                   benar = 1;
                   skor=0;
                   jmlh_skor = jmlh_skor-skor;
                   a_bonus= a_bonus + bonus;

               }
                 
             }     
             }
        //void jumlah nilai
        void skor(){
            
            if (a_bonus <5){
                jmlh_bonus=50;
            } else{
                 jmlh_bonus=0;
            }
            System.out.println("Score anda: "+jmlh_skor);
            System.out.println("Bonus : "+jmlh_bonus);
            int skor_total=jmlh_skor + jmlh_bonus;
            System.out.println("Skor total : "+skor_total);
        }
}
