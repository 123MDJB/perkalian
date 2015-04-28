/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perkalian;

/**
 *
 * @author fuad
 */import java.util.Scanner;
public class Perkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masuk=new Scanner(System.in);
System.out.print("NILAI PERTAMA:");
int N1= masuk.nextInt();

System.out.print("NILAI KEDUA:");
int N2= masuk.nextInt();

int hasil=N1*N2;
System.out.print ("hasil total=" +hasil);
     }

    }

