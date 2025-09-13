import java.util.*;
import java.io.*;
class Main{

    public static void main(String[] args) {
        LinkedList<String> history=new LinkedList<>();
        history.add("abc");
        history.add("def");
        history.add("ghi");
        history.add("jkl");
        history.add("mno");
        Stack<String >stacks=new Stack<>();
        for(String num:history){
            System.out.print(stacks.push(num)+ " ");


        }
while(!stacks.isEmpty()){

    System.out.print(stacks.pop()+ " ");



}

        System.out.print(history+" ");
        history.removeLast();
        System.out.println();
        System.out.println(history.getLast());
history.clear();
        System.out.println(history);







    }



}