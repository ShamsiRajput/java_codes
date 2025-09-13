

public class loading {



    public void info(String name){
        System.out.println("Name: "+name);


    }
    public void info(int age){
        System.out.println("Age:"+ age);
    }
    public void info(float cgpa,String num)
    {
        System.out.println("cgpa: "+cgpa);
        System.out.println("contact"+ num);
    }
    public void info(String zahra,double salary){

        System.out.println("husband name: "+zahra);
        System.out.println("salary"+salary+"$");
    }
    public static void main(String [] args){
        loading obj=new loading();
        obj.info("zahra");
        obj.info(20);
        obj.info(3.8f,"0300394834");
        obj.info("shamsi",1000000.0);



    }


}
