import java.util.ArrayList;

public class listarray {

    private ArrayList<String> name;

    listarray() {
        this.name = new ArrayList<>();

    }

    public void setName(String nam) {
        name.add(nam);
    }

    public ArrayList<String> getName() {
        return name;
    }



public static void main(String[] args) {
        listarray obj=new listarray();
        obj.setName("shmasi");
        obj.setName("zhara");
        obj.setName("aryan");

    System.out.println(obj.getName());


}
}
