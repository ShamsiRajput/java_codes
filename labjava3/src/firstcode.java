

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;


class firstcode {


    public static void main(String[] args){
ArrayList<Integer>num=new ArrayList<>();
num.add(0);
num.add(50);
num.add(75);
num.add(100);
num.add(25);

for(Integer number: num){
    int i=1;
    System.out.println(("light"+ i +":")+number);
    i++;
}

num.set(3,90);
System.out.println("After update:");

        for(Integer number: num){
            int i=1;
            System.out.println(("light"+ i +":")+number);
            i++;
        }





    }

}
