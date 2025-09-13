public class over {
    public void info(String name){
        System.out.println("NAME: "+name);

    }
    public void info(int age){
        System.out.println("Age: "+age);
    }

    public void info( float cgpa,String ph_no){
        System.out.println("CGPA: "+cgpa);
        System.out.println("contct_no: "+ph_no);


    }
    public static void main(String [] args){

        over obj=new over();
        obj.info("Shmasi");
        obj.info(21);
        obj.info(3.98f,"03057999975");
    }


}
