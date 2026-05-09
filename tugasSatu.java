import java.util.LinkedList;

public class tugasSatu {
  public static void main(String[] args) {
    float strukturBaris = 12.5f;

    System.out.println(strukturBaris);

    String susunanKataBaru = "Pemrograman Struktur Data Java";
    System.out.println(susunanKataBaru);
    
    int[] arrayPertama = {10, 12, 18, 23, 33, 58, 67, 82};
    System.out.println(arrayPertama[3]);

    int[][] duaAngka = {{2, 4, 6,}, {8, 10, 12}, {14, 16, 18}};
    System.out.println(duaAngka[0][2]);

    LinkedList<Integer> urutanListAngka = new LinkedList<>();
    urutanListAngka.add(15);
    urutanListAngka.add(28);
    urutanListAngka.add(33);
    urutanListAngka.add(47);
    urutanListAngka.add(59);

    System.out.println(urutanListAngka);
  }

}
