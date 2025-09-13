

import java.util.Scanner;

public class car {

    private String model;
    private int year;
    private String color;


    Scanner input = new Scanner(System.in);

    public car () {

        System.out.println("Enter the model name:");
        model = input.nextLine();
        System.out.println("Enter the color:");
        color = input.nextLine();

        System.out.println("Enter the yaer:");
        year = input.nextInt();


    }

    public car setinfo(String model, String color, int year) {


        this.color = color;
        this.year = year;
        this.model = model;
        return this;}

    void display() {

        System.out.println("COLOR: " + color + " MODEL: " + model + " YEAR: " + year);

    }}
     class Mian{
        public static void main(String[] args) {

            car obj = new car();

            obj.display();





    }

}
