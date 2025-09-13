import java.util.Scanner;

class Calcu2 {
    int a, b;
    String ch;

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int dic(int a, int b) {


        return a / b;
    }

    public Calcu2() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        a = input.nextInt();
        System.out.print("Enter b: ");
        b = input.nextInt();
        System.out.print("What do you want (+, -, *, /): ");
        ch = input.next();
    }

    public static void main(String[] args) {
        Calcu2 obj = new Calcu2();
        int result;

        switch (obj.ch) {
            case "+":
                result = obj.add(obj.a, obj.b);
                break;
            case "-":
                result = obj.sub(obj.a, obj.b);
                break;
            case "*":
                result = obj.mul(obj.a, obj.b);
                break;
            case "/":
                result = obj.dic(obj.a, obj.b);
                break;
            default:
                System.out.println("Invalid operation");
                return; // Exit if the operation is invalid
        }

        System.out.println("Result: " + result);}
}