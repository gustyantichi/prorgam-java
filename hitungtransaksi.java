package hitungtransaksi;


import java.util.Scanner;;
public class hitungtransaksi {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner (System.in);
        int  harga,jumlah,total,diskon;
        
       
        System.out.print(" Berapa Harga Barang : ");
        harga= sc.nextInt();
        System.out.print(" Berapa Jumlah Barang Yang Diambil : ");
        jumlah= sc.nextInt();
        
        
        total= jumlah * harga ;
        System.out.println("Total Bayar : Rp." + harga*jumlah);
        
        
        if (total >= 1500000) {
            diskon = total * 15 /100;
            total = total-diskon;
            System.out.println("diskon=15%\n" + total);
            
            
        }else  if(total >=660000) {
            diskon = total * 15 /100;
            total = total - diskon;
            System.out.println("diskon=15%\n" + total);
            
        }
       
    }
}
