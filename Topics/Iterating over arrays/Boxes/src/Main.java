
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String row1 = sc.nextLine();
        String row2 = sc.nextLine();
        String[] partsRow1 = row1.split(" ");
        String[] partsRow2 = row2.split(" ");
        int[] partsRowInt1 = new int[3];
        int[] partsRowInt2 = new int[3];
        for (int i = 0; i < 3; i++) {
            partsRowInt1[i] = Integer.parseInt(partsRow1[i]);
            partsRowInt2[i] = Integer.parseInt(partsRow2[i]);
        }
        Arrays.sort(partsRowInt1);
        Arrays.sort(partsRowInt2);
        if (partsRowInt1[0] > partsRowInt2[0] & partsRowInt1[1] > partsRowInt2[1] & partsRowInt1[2] > partsRowInt2[2]) {
            System.out.println("Box 1 > Box 2");
        } else if (partsRowInt1[0] < partsRowInt2[0] & partsRowInt1[1] < partsRowInt2[1] & partsRowInt1[2] < partsRowInt2[2]) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}