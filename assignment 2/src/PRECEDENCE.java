import java.util.Scanner;

class Stack {

   void oppraters(String input) {
      System.out.println("This is the operators:");
      for (int i = 0; i < input.length(); i++) {
         char ch = input.charAt(i);
         if (isOperator(ch)) {
            System.out.print(ch + " ");
         }
      }
      System.out.println();
   }

   void oprendes(String input) {
      System.out.println("This is the operands:");
      for (int i = 0; i < input.length(); i++) {
         char ch = input.charAt(i);
         if (Character.isLetterOrDigit(ch)) {
            System.out.print(ch + " ");
         }
      }
      System.out.println();
   }

   private boolean isOperator(char ch) {
      return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
   }

   private int precedence(char operator) {
      if (operator == '+' || operator == '-') {
         return 1;
      } else if (operator == '*' || operator == '/') {
         return 2;
      } else if (operator == '^') {
         return 3;
      }
      return -1;
   }

   public String infixToPostfix(String infix) {
      java.util.Stack<Character> stack = new java.util.Stack<>();
      String postfix = "";

      for (int i = 0; i < infix.length(); i++) {
         char current = infix.charAt(i);

         if (Character.isLetterOrDigit(current)) {
            postfix += current;
         } else if (current == '(') {
            stack.push(current);
         } else if (current == ')') {
            while (!stack.isEmpty() && stack.peek() != '(') {
               postfix += stack.pop();
            }
            stack.pop();
         } else if (isOperator(current)) {
            while (!stack.isEmpty() && precedence(current) <= precedence(stack.peek())) {
               postfix += stack.pop();
            }
            stack.push(current);
         }
      }

      while (!stack.isEmpty()) {
         postfix += stack.pop();
      }

      return postfix;
   }

   public static void main(String[] args) {
      String value;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the values of infix to convert to postfix:");
      value = input.nextLine();
      Stack obj = new Stack();

      obj.oprendes(value);
      obj.oppraters(value);

      String postfixExpression = obj.infixToPostfix(value);
      System.out.println("Postfix expression: " + postfixExpression);
   }
}