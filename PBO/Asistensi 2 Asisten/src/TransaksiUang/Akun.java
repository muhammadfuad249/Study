/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransaksiUang;

/**
 *
 * @author Legion 5 Pro
 */
public class Akun {
    private int id;
    private Transaksi[] transaksi;
    private int size;
    private static final int MAX_SIZE = 100;

    public Akun(int id) {
        this.id = id;
        this.transaksi = new Transaksi[MAX_SIZE];
        this.size = 0;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public void sendMoneyToAccount(Akun accountTo, double moneyAmount) {
        if (accountTo != null && moneyAmount > 0) {
            Transaksi sendTransaction = new Transaksi(this, accountTo, moneyAmount,
                    OperasiTransaksi.TRANSFER_SEND);
            addTransaction(sendTransaction);
            accountTo.receiveMoney(this, moneyAmount);
        }
    }

    private void receiveMoney(Akun accountFrom, double moneyAmount) {
        Transaksi receiveTransaction = new Transaksi(accountFrom, this, moneyAmount,
                OperasiTransaksi.TRANSFER_RECEIVE);
        addTransaction(receiveTransaction);
    }

    public void withdrawMoney(double moneyAmount) {
        if (moneyAmount > 0) {
            Transaksi withdrawTransaction = new Transaksi(this, null, moneyAmount,
                OperasiTransaksi.WITHDRAW);
            addTransaction(withdrawTransaction);
        }
    }

    public Transaksi[] getTransaksi() {
        Transaksi[] result = new Transaksi[size];
        System.arraycopy(transaksi, 0, result, 0, size);
        return result;
    }

    private void addTransaction(Transaksi transaction) {
        if (size >= transaksi.length) {
            // Perbesar array jika penuh
            Transaksi[] newTransactions = new Transaksi[transaksi.length * 2];
            System.arraycopy(transaksi, 0, newTransactions, 0, transaksi.length);
            transaksi = newTransactions;
        }
        transaksi[size++] = transaction;
    }

    public static class Transaksi {
        private Akun dariAkun;
        private Akun keAkun;
        private double jumlah;
        private OperasiTransaksi operation;

        public Transaksi(Akun dariAkun, Akun keAkun, double jumlah,OperasiTransaksi operation) {
            this.dariAkun = dariAkun;
            this.keAkun = keAkun;
            this.jumlah = jumlah;
            this.operation = operation;
        }

        public Akun getDariAkun() { 
            return dariAkun; 
        }
        public Akun getKeAkun() { 
            return keAkun; 
        }
        public double getJumlah() { 
            return jumlah; 
        }
        public OperasiTransaksi getOperation() { 
            return operation; 
        }

       
        @Override
        public String toString() {
            return "Transkasi{Dari Akun : " + (dariAkun != null ? dariAkun.getId() : "null") +
                   ", Ke Akun : " + (keAkun != null ? keAkun.getId() : "null") +
                   ", Nominal : " + jumlah + ", Jenis Transaksi : " + operation + "}";
        }
    }
}
