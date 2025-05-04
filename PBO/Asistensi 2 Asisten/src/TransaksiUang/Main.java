/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransaksiUang;

/**
 *
 * @author Legion 5 Pro
 */
public class Main {
    public static void main(String[] args) {
        Akun akun1 = new Akun(1);
        Akun akun2 = new Akun(2);

        akun1.sendMoneyToAccount(akun2, 100.0);
        akun1.withdrawMoney(50.0);

        System.out.println("Account 1 Transactions: " + java.util.Arrays.toString(akun1.getTransaksi()));
        System.out.println("Account 2 Transactions: " + java.util.Arrays.toString(akun2.getTransaksi()));
        
        
//        System.out.println("Transaksi akun " + akun1.getId() + ":");
//        for (Akun.Transaksi transaksi : akun1.getTransaksi()) {
//            System.out.println("Operasi \t: "+ transaksi.getOperation());
//            System.out.println("Jumlah  \t: "+transaksi.getJumlah());
//            System.out.println("ke      \t: "+(transaksi.getKeAkun() != null ? transaksi.getKeAkun().getId() : "Tidak ada"));
//            System.out.println("dari    \t: "+(transaksi.getDariAkun() != null ? transaksi.getDariAkun().getId() : "Tidak ada"));
//            System.out.println("--------------------------------");
//            System.out.println("");
//        }

    }
}