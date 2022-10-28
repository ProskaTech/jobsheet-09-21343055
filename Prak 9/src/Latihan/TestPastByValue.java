/*
 * Nama : Muhamad Fathur Rahman
 * NIM  : 21343055
 * Prodi: Teknik Informatika
 */
package Latihan;

public class TestPastByValue {
   public static void main(String[] args) {
    int i = 10;
    System.out.println(i);

    test(i);
    System.out.println(i);
   } 
   public static void test(int j) {
    j = 33;
   }
}
