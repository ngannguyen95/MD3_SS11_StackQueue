package stack_LinkedList;

public class GenericStackClient {
    public static void stackOfStrings() {
        // phương thức in ra mảng trước và sau đảo ngược chuỗi
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 kích thước stack sau khi push: " + stack.size());
        System.out.println("1.2 các phần tử tù stack: ");
        while (!stack.isEmpty()) {
            System.out.printf("%s ", stack.pop());
        }
        System.out.println("1.3 kích thước stack sau khi pop: " + stack.size());
    }

    // phương thức in ra mảng số nguyên trước và sau khi đảo ngượ
    private static void stackOfIntergers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 kích thước trước khi push: " + stack.size());
        System.out.println("2.2 pop cc phần tử từ stack:");
        while (!stack.isEmpty()) {
            System.out.printf("%d", stack.pop());
        }
        System.out.println("\n 3.3 kích thước của stack sau khi pop:" + stack.size());

    }

    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntergers();
        System.out.println("\n2. Stack of Strings");
        stackOfStrings();
    }

}
