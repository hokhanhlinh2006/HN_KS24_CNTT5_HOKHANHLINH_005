import java.util.*;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap danh muc: ");
        String input = sc.nextLine();
        String[] arr = input.split(",");

        Map<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            s = s.trim().toLowerCase();
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        System.out.print("Tim kiem: ");
        String search = sc.nextLine().toLowerCase();
        if (map.containsKey(search)) {
            System.out.println("Search \""+search +"\": "+ map.get(search));
        } else {
            System.out.println("Search \""+search + "\":0");
        }
    }
}
