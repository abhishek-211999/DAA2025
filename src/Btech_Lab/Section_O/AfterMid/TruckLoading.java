package Btech_Lab.Section_O.AfterMid;
import java.util.Arrays;

//Activity Selection Problem

public class TruckLoading {
    public static void main(String[] args) {
        int[][] boxTypes = {
                {1, 3},  // 1 box, 3 units per box
                {2, 2},  // 2 boxes, 2 units per box
                {3, 1}   // 3 boxes, 1 unit per box
        };
        int truckSize = 4; // The truck can carry up to 4 boxes

        TruckLoading tl = new TruckLoading();
        int maxUnits = tl.maximumUnits(boxTypes, truckSize);
        System.out.println("Maximum units that can be loaded: " + maxUnits);
    }

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        int boxes = 0;
        for (int[] box : boxTypes) {
            if (truckSize >= box[0]) {
                boxes += box[0] * box[1];
                truckSize -= box[0];
            } else {
                boxes += truckSize * box[1];
                return boxes;
            }
        }
        return boxes;
    }
}
