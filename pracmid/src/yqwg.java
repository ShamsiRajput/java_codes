import java.util.Stack;

public class yqwg {


    public static void main(String[] args) {


        Stack<Integer> s = new Stack<>();
        Stack<Integer> sort = new Stack<>();

        s.push(23);
        s.push(65);
        s.push(2);
        s.push(90);
        s.push(1);
        System.out.println(s);

        while (!s.isEmpty()) {

            int temp = s.pop();


                while (!sort.isEmpty()&&temp < sort.peek()) {

                    s.push(sort.pop());


                }
                sort.push(temp);


            }


        System.out.print(sort);

    }

}
