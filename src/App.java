import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> lsData = new ArrayList<>();
        lsData.addAll(List.of(12, 90, 99, 12, 33, 54, 65, 32, 78, 98, 12, 9, 34, 76, 44, 22, 11, 1));
        System.out.println("lsData value : " + lsData);

        bubbleSort(lsData);
        System.out.print("bubbleSort value : ");
        printArray(lsData);

        bubbleSortSc(lsData);
        System.out.print("bubbleSortSc value : ");
        printArray(lsData);

        bubbleSortTr(lsData);
        System.out.print("bubbleSortTr value : ");
        printArray(lsData);
    }

    /* bubleSort first method */
    public static void bubbleSort(List<Integer> arr) {
        int dataSize = arr.size();
        for (int i = 0; i < dataSize - 1; i++) {
            for (int j = 0; j < dataSize - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }

    /* bubleSort seccond method */
    public static void bubbleSortSc(List<Integer> arr) {
        int dataSize = arr.size();
        for (int i = 0; i < dataSize - 1; i++) {
            for (int j = 0; j < dataSize - 1 - i; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
    }

    /* bubleSort third method */
    public static void bubbleSortTr(List<Integer> arr) {
        int dataSize = arr.size();
        boolean swapped;
        for (int i = 0; i < dataSize - 1; i++) {
            swapped = false;
            for (int j = 0; j < dataSize - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    /* bubleSort logger */
    public static void printArray(List<Integer> arr) {
        int dataSize = arr.size();
        for (int i = 0; i < dataSize; i++) {
            System.out.print(arr.get(i) + ", ");
        }
        System.out.println();
    }
}
