import java .util.ArrayList;
class fruits {

    public static void main(String[] args){
        ArrayList<String>fruits=new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("cherry");
        fruits.add("date");
        System.out.println("Fruits of array: "+fruits);
        System.out.println("Fisrt fruits:"+ fruits.get(0));
        System.out.println("third fruits:"+ fruits.get(2));
        fruits.set(1,"orange");
        System.out.println("After update "+fruits);
        fruits.remove("date");
        System.out.println("After remove "+fruits);
        System.out.println("Array of size :"+fruits.size());
        System.out.println("List of Fruits: ");
        for(String fruit:fruits){
            System.out.println(fruit);

        }
        boolean hasApple=fruits.contains("Apple");
System.out.println("Does the Fruits List contain Apple:"+hasApple);
fruits.clear();
System.out.println("After the clear fruit list :"+fruits);

    }


}
