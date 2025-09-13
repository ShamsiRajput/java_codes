import java.util.Scanner;

import java.util.Scanner;

public class setter{
   private String color;
    private String model;
    private int year;
setter setcolor(String color){
    this.color=color;
return this;
}
setter setmodel(String model){
    this.model=model;
return this;
}
setter setyear(int year){
    this.year=year;

return this;
}

void display(){
    System.out.println("color: "+color+ "  model: "+model+ "  year: "+ year);
}



public static void main(String [] args) {
Scanner input=new Scanner(System.in);
setter obj=new setter();

String model,color;
int year;
    System.out.println("Enter the color name:");
    color=input.nextLine();
    System.out.println("Enter the model name:");
    model=input.nextLine();

    System.out.println("Enter the year name:");
    year=input.nextInt();

    obj.setcolor(color);
   obj.setmodel(model);
   obj.setyear(year);
obj.display();
}
}