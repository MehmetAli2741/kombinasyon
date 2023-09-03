import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int n,r,n_total = 1,r_total = 1 ,nrtotal= 1,result = 1;
       Scanner inp = new Scanner(System.in);

       System.out.print("1. Sayıyı Giriniz: ");
       n = inp.nextInt();

       System.out.print("2.Sayıyı Giriniz: ");
       r = inp.nextInt();

       for (int i = 1; i <= n; i++){
           n_total = n_total * i;
       }
       System.out.println("1.Sayının Faktöriyeli: "+ n_total);

       for (int j =1; j <= r; j++){
           r_total = r_total * j;
       }
       System.out.println("2.Sayının Faktöriyeli: "+r_total);

       for (int k =1; k <= (n-r); k++){
           nrtotal = nrtotal * k;
       }
       System.out.println("n-r: " + (n-r ) + "!");
       System.out.println("(n-r)'nin Faktöriyel Degeri: " + nrtotal);
       result = n_total / (nrtotal * r_total);
       System.out.println("C(n,r) = n! / (r!(n-r)) " + "Sonuc : " + result);
    }
}