import java.sql.SQLOutput;
import java.util.Stack;

class SortStackInMain {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Stack<Integer> sort = new Stack<>();

        // Push sample elements
        s.push(4);
        s.push(3);
        s.push(1);
        s.push(5);
        s.push(2);


        System.out.println(s);
        System.out.println();
//
//        // Sorting logic
//        while (!s.isEmpty()) {
//            int temp = s.pop();
//
//            while (!sort.isEmpty() && sort.peek() > temp) {
//                {
//                    s.push(sort.pop());
//                }
//            }
//                sort.push(temp);
//            }

            //  Optional: move back to rev if needed in original stack
//         while (!sort.isEmpty()) {
//             rev.push(sort.pop());
//
//         }
//        System.out.println(rev);




        while(!s.isEmpty()){
            int temp=s.pop();
            while(!sort.isEmpty()&&sort.peek()>temp) {

                s.push(sort.pop());


            }
            sort.push(temp);

        }

            // Output the sorted stack
            System.out.println("Sorted Stack (ascending): " + sort);

        System.out.println();
        Stack<Integer>reverse=new Stack<>();
       while (!sort.isEmpty()){
            reverse.push(sort.pop());

        }
        System.out.println(reverse);
        }
    }