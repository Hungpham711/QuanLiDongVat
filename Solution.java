import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Import your library
// Do not change the name of the Solution class
public class Solution {

    public static void print(List<Loai> arr) {
        for (Loai animals : arr) {
            if (animals.DiBo() == true) {
                System.out.println("Con " + animals.getName() + " co the di bo");
            }
            if (animals.DiBoi() == true) {
                System.out.println("Con " + animals.getName() + " co the di boi");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Loai> arr = new ArrayList<>();
        arr.add(new Ca());
        arr.add(new Lon());
        arr.add(new Vit());

        print(arr);
    }
}