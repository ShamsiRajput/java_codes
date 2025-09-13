public class field {
    String name="zahra";



}
class superfeild extends field{
    String name="shamsi";
     void showname(){
         System.out.println("name of wife: "+super.name);
         System.out.println("name of husband: "+this.name);
     }


}
 class hidden{
    public static void main(String [] args){
        superfeild obj=new superfeild();
        obj.showname();

    }

}
