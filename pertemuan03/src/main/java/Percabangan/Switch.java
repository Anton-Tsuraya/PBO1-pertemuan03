/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percabangan;

/**
 *
 * @author ANTON TSURAYA
 */
public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch(nilai){
            case 'A':
                System.out.println("Mhs   : \"Terima kasih pak\"");
                System.out.println("Dosen   : \"Selamat Ya !!\"");
                break;
            case 2:
                System.out.println("urang acayan");
            case 'B':
                System.out.println("Mhs   : \"Kenapa ulun kada dapat A, pak?\"");
                System.out.println("Dosen   : \"@#$!#\"");
                break;
            case 3:
                System.out.println("ubat nyamuk");
            case 'C':
                System.out.println("Mhs   : \"Ulun turun pul pak ai, tugas pul jua\"");
                System.out.println("Dosen   : \"Tapi bisa lah menjawab ujian?\"");
                System.out.println("Mhs   : \"hihihi..\"");
                break;
            case 4:
                System.out.println("dubil dit");
                break;
            case 5:
                System.out.println("mahluk halus");
            default:
                System.out.println("Mhs     : \"Ulun turun pul pak ai, tugas pul jua\"");
                System.out.println("Dosen   : \"Bujur jua kah ?\"");
                System.out.println("Dosen   : \"memeriksa berkas\"");
                System.out.println("Dosen   : \"*mencelang\"");
                System.out.println("Mhs     : \"Kabur..\"");
                break;
        }
    }
}
