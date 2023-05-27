import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> testList = new ArrayList<>();
        ArrayList<Integer> testList1 = new ArrayList<>();
        for (int i = 0;i< 10;i++){
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            testList.add(num);
        }
        for (Integer integer : testList) {
            if (integer % 2 != 0) {
                System.out.println(integer);
            }
        }
    }
}