import java.util.Scanner;

class NodeChar {
    char data;
    NodeChar next;

    NodeChar(char data) {
        this.data = data;
        this.next = null;
    }
}
class StackChar {
    NodeChar top;

    void push(char x) {
        NodeChar newNode = new NodeChar(x);
        newNode.next = top;
        top = newNode;
    }

    char pop() {
        if (top == null) return '\0';
        char value = top.data;
        top = top.next;
        return value;
    }

    boolean isEmpty() {
        return top == null;
    }
}

public class Bai3_KiemTraNgoac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        StackChar stack = new StackChar();
        boolean hopLe = true;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {

                if (stack.isEmpty()) {
                    hopLe = false;
                    break;
                }

                char top = stack.pop();

                if ((c == ')' && top == '(') ||
                        (c == '}' && top == '{') ||
                        (c == ']' && top == '[')) {
                } else {
                    hopLe = false;
                    break;
                }
            }
        }
        if (!stack.isEmpty()) {
            hopLe = false;
        }

        if (hopLe)
            System.out.println("True");
        else
            System.out.println("False");

        sc.close();
    }
}