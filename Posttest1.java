package posttest1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

class Musik{
    private String nama_barang;
    private String merk_barang;
    private String harga_barang;
    
    public Musik (String nama_barang, String merk_barang, String harga_barang){
        this.nama_barang = nama_barang;
        this.merk_barang = merk_barang;
        this.harga_barang = harga_barang;
    }    
    
    public String getNama(){
        return this.nama_barang;
    }
    
    public String getMerk(){
        return this.merk_barang;
    }
    
    public String getharga(){
        return this.harga_barang;
    }
    
    public void setNama(String namaBaru){
        this.nama_barang = namaBaru;
    }
    
    public void setMerk(String merkBaru){
        this.merk_barang = merkBaru;
    }
    
    public void setHarga(String hargaBaru){
        this.harga_barang = hargaBaru;
    }
}

public class Posttest1 {
    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<Musik> datamusik = new ArrayList<>();
        
        while(true){
            System.out.println("____________________");
            System.out.println("- Toko Alat Musik   ");
            System.out.println("____________________");
            System.out.println("        Menu        ");
            System.out.println("____________________");
            System.out.println("1 Tambah Barang     ");
            System.out.println("2 Liat Barang       ");
            System.out.println("3 Update Barang     ");
            System.out.println("4 Hapus Barang      ");
            System.out.println("5 Exit              ");
            System.out.println("____________________");
            System.out.print("Pilihan :");
            
           int menu = Integer.parseInt(br.readLine());
           
           switch (menu) {
               case 1 -> {
                   System.out.print("Nama : ");
                   String name = br.readLine();
                   System.out.print("Merk : ");
                   String merk = br.readLine();
                   System.out.print("Harga : ");
                   String harga = br.readLine();
                   Musik newmusik = new Musik(name, merk, harga);
                   datamusik.add(newmusik);
                }
               case 2 -> {
                   System.out.println("Hapus Data ");
                   for (int i = 0; i < datamusik.size(); i++){
                       System.out.println("Data pelanggan Ke : " + (i+1));
                       System.out.println("Nama  : " + datamusik.get(i).getNama());
                       System.out.println("Merk  : " + datamusik.get(i).getMerk());
                       System.out.println("Harga : " + datamusik.get(i).getharga());
                   }
                }
               case 3 -> {
                   System.out.println("Masukkan Nama Barang :");
                   String Nama = br.readLine();
                   for (Musik setpelanggan : datamusik){
                       if (setpelanggan.getNama().equals(Nama)){
                           System.out.println("Ganti Nama Barang : ");
                           setpelanggan.setNama(br.readLine());
                           System.out.println("Ganti merk Barang : ");
                           setpelanggan.setMerk(br.readLine());
                           System.out.println("Ganti harga Barang : ");
                           setpelanggan.setHarga(br.readLine());
                       }
                   }
                }
               case 4 -> {
                   System.out.println("Hapus Nama Barang");
                   System.out.println("Masukkan Nama Barang : ");
                   String hapus_data = br.readLine();
                   for(int i = 0; i < datamusik.size(); i++){
                       if(datamusik.get(i).getNama().equals(hapus_data)){
                           datamusik.remove(i);
                           System.out.println("data berhasil dihapus");
                       }
                       
                   }
                }
               case 5 -> {
                   System.exit(menu);
                }
                   
           }
        }
    }
}