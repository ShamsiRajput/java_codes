//import java.util.Stack;
//
//class stack{
//
//
//    public static void main(String[] args) {
//
//        int []arr={3,5,6,3,6,4};
//        for(int i=0;i<arr.length;i++){
//
//            System.out.print(arr[i]+ " ");
//        }
//        System.out.println();
//        Stack<Integer> rev=new Stack<>();
//        for(int i=0;i<arr.length;i++){
//
//            rev.push(arr[i]);
//
//        }
//        System.out.println(rev);
//
//
//        Stack<Integer>newRev=new Stack<>();
//
//        while(!rev.isEmpty()){
//
//            newRev.push(rev.pop());
//
//        }
//
//        System.out.println(newRev);
//Stack<Integer>sort=new Stack<>();
//
//        while (!rev.isEmpty()) {
//            int temp = rev.pop();
//
//            while (!sort.isEmpty() && sort.peek() > temp) {
//                rev.push(sort.pop());
//            }
//
//            sort.push(temp);
//        }
//
//        // Sorted stack (ascending top-to-bottom)
//        System.out.println("Sorted stack: " + sort);
//    }
//
//    }
//import java.util.Stack;
//
//public class SortStack {
//
//    public static void sort(Stack<Integer> input) {
//        Stack<Integer> tempStack = new Stack<>();
//
//        while (!input.isEmpty()) {
//            int temp = input.pop();
//
//            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
//                input.push(tempStack.pop());
//            }
//
//            tempStack.push(temp);
//        }
//
//        // Optional: move back to original stack for ascending order on top
//        while (!tempStack.isEmpty()) {
//            input.push(tempStack.pop());
//        }
//    }
//
//    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(34);
//        stack.push(3);
//        stack.push(31);
//        stack.push(98);
//        stack.push(92);
//        stack.push(23);
//
//        System.out.println("Original Stack: " + stack);
//        sort(stack);
//        System.out.println("Sorted Stack: " + stack);
//    }
//}
//
//
