class persone {
    String name, CNIC, gander;
    int age;
    int id;

    public persone(String name, String CNIC, String gander, int age,int id) {
        this.name = name;
        this.CNIC = CNIC;
        this.gander = gander;
        this.age = age;
        this.id=id;
    }
}

class teachersss extends persone{

int salary;
String office_loc;

    public teachersss(String name, String CNIC, String gander, int age, int id, int salary, String office_loc) {
        super(name, CNIC, gander, age, id);
        this.salary = salary;
        this.office_loc = office_loc;
    }
}
class Students extends persone{
    int fee;

    public Students(String name, String CNIC, String gander, int age, int id, int fee) {
        super(name, CNIC, gander, age, id);
        this.fee = fee;
    }
}




public class MAIN3 {
}
