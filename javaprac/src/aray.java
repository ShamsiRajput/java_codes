
import java.util.ArrayList;

public class aray {
    int sum=0;
    aray(){

    ArrayList<Integer>num=new ArrayList<>();
        num.add(3);
        num.add(6);
        num.add(5);

        System.out.print(num);
     for(int numb:num) {
         sum = sum += numb;
     }

        System.out.print("= "+sum);
    }

    public static void main(String [] args){

      aray obj=new aray();


    }


}
