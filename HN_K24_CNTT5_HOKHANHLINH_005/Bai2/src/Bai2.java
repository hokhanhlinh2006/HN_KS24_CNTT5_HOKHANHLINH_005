import java.util.*;
public class Bai2 {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten danh muc :");
        String input = sc.nextLine();
    }
  if (input.trim().isEmpty()) {
        System.out.println("Chuoi khong hop le");
        return;
    }

    Map<String, Integer> map = new HashMap<>();
    String[] arr = input.split(",");

        for (int i = 0; i < arr.length; i++) {

        String tag = arr[i].trim().toLowerCase();
        if (map.containsKey(tag)) {
            int soLan = map.get(tag);
            map.put(tag, soLan + 1);
        } else {
            map.put(tag, 1);
        }
    }

}
