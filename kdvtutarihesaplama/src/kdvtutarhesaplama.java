import java.util.Scanner;
public class kdvtutarhesaplama {
    public static void main(String[] args) {
        double tutar,kdvOran = 0.18;
        Scanner inp = new Scanner(System.in);
        System.out.println("ücret tutarını girin:");
        tutar = inp.nextDouble();
        double kdvTutar = tutar * kdvOran;
        System.out.println(kdvTutar);
        double toplamtutar = tutar + kdvTutar;
        System.out.println(toplamtutar);


    }
}
