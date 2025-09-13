//import java.sql.SQLOutput;
//import java.util.HashMap;
//import java.util.Scanner;
//import java.util.TreeSet;
//
//public class custumer {
//    String name;
//    int age;
//    int id;
//
//
//    public custumer(String name,int id,int age){
//
//
//        this.name=name;
//        this.id=id;
//        this.age=age;
//
//
//    }
//
//
//    public String toString(){
//
//        return "name: "+name+ "  age: "+ age+ "  id: "+id;
//
//
//    }
//
//
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//
//        HashMap<Integer,custumer> Economy=new HashMap<>();
//        HashMap<Integer,custumer>Premium=new HashMap<>();
//        HashMap<Integer,custumer>VIP=new HashMap<>();
//
//        VIP.put(112,new custumer("Shamsi",22,345));
//        VIP.put(345,new custumer("Irfan",18,897));
//
//        VIP.put(566,new custumer("Yasir",28,643));
//
//
//
//    System.out.println(VIP);
//
//
//
//int type;
//
//        System.out.println("1 •\tBooking a Seat (VIP, Economy, Premium.)\n" +
//                "2 •\tReserve and cancel bookings\n" +
//                "3 •\tUndo the last booking or cancellation\n" +
//                "4 •\tProvide quick access to seat and reservation information\n");
//type=input.nextInt();
//
//
//
//
//
//
//int categorize;
//
//
//
//        System.out.println("Enter the type of ticket: ");
//        System.out.println("\n1: VIP, \n2: Premium, \n3: Economy,");
//
//        categorize=input.nextInt();
//if(categorize==1){
//
//    String name;
//    int age;
//    int id;
//int setNo;
//    System.out.println("Enter the SeatNO: ");
//    setNo=input.nextInt();
//    System.out.println("Enter The Customer name: ");
//    name=input.next();
//    System.out.println("Enter the age: ");
//    age=input.nextInt();
//    System.out.println("Enter the id: ");
//    id=input.nextInt();
//
//    System.out.print("Recent add: ");
//    System.out.println(VIP.put(setNo,new custumer(name,age,id)));
//    System.out.println("now total Reserved INFO: ");
//
//while (!VIP.isEmpty()){
//
//    System.out.println(VIP);
//
//}
//
//
//
//}
//        else if(categorize==2){
//
//            String name;
//            int age;
//            int id;
//            int setNo;
//    System.out.println("Enter the SeatNO: ");
//setNo=input.nextInt();
//            System.out.println("Enter The Customer name: ");
//            name=input.next();
//            System.out.println("Enter the age: ");
//            age=input.nextInt();
//            System.out.println("Enter the id: ");
//            id=input.nextInt();
//
//            System.out.print("Recent add: ");
//            System.out.println(Premium.put(setNo,new custumer(name,age,id)));
//            System.out.println("now total Reserved INFO: ");
//
//          while (!Premium.isEmpty()){
//
//              System.out.println(Premium);
//
//          }
//
//
//        }
//else if(categorize==3){
//
//    String name;
//    int age;
//    int id;
//    int setNo;
//    System.out.println("Enter the SeatNO: ");
//    setNo=input.nextInt();
//    System.out.println("Enter The Customer name: ");
//    name=input.next();
//    System.out.println("Enter the age: ");
//    age=input.nextInt();
//    System.out.println("Enter the id: ");
//    id=input.nextInt();
//
//    System.out.print("Recent add: ");
//    System.out.println(Economy.put(setNo,new custumer(name,age,id)));
//    System.out.println("now total Reserved INFO: ");
//
//  while(!Economy.isEmpty()){
//
//      System.out.println(Economy);
//
//  }
//
//
//
//}
//
//else if(type==2){
//    int Search_setNo;
//    System.out.println("Enter the SeatNO: ");
//    Search_setNo=input.nextInt();
//    if(VIP.containsKey(Search_setNo)){
//
//        System.out.println("yup contain this seat no:");
//
//
//    }
//
//
//
//}
//
//
//
//    }
//
//
//
//
//}
