class parent {
    String name;
    int year;
    double busniss;

    parent(String name, int year, double busniss) {
        this.name = name;
        this.year = year;
        this.busniss = busniss;
    }

    void display(){

        System.out.println("I am the bad huy:");
        System.out.println("name: "+name);

        System.out.println("year: "+ year);
        System.out.println("total busniness: "+ busniss);
    }}
    class child extends parent {
    double salary=busniss/100*15;
    String cus_name;

    child(String name, int year, double busniss,String cus_name){
        super(name,year,busniss);

        this.cus_name=cus_name;



    }



        @Override
        void display() {
            super.display();
            System.out.println("saler name:"+cus_name);
            System.out.println("salary: "+salary);

    }
    }
    public class Main {
        public static void main(String[] args) {

           parent obj=new child("RJS",2025,346378,"Shamsi");

           obj.display();

        }
}