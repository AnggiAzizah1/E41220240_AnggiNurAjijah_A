package methodprocedur;

import java.util.Scanner;

/**
 *
 * @author anggi nur azizah
 */
public class MethodProcedur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print ("masukkan panjang: ");
    int p = input.nextInt();
    System.out.print ("masukkan lebar: ");
    int l = input.nextInt();
    System.out.print ("masukkan tinggi: ");
    int t = input.nextInt();
    
    int luasPermukaan = 2*((p*l)+(p*t)+(l*t));
    System.out.println ("Luas Permukaan Balok Adalah: "+luasPermukaan);
    
    int volume = p*l*t;
    System.out.println("volune balok  adalah: "+volume);
    
    }
    
}
