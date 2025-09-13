class Faculty{
    static {

        System.out.println("static block: faculty class ");
    }




        private String name;
        Faculty (String name)
        {
            this.name = name;
            System.out.println("Constructor : Faculty " + name + "created.");
    }
    public String getName(){
            return name;
    }
}

class Department
{
    private String name;
    private Faculty [] facultyMembers;

    static {
        System.out.println("static block: department  class <");
    }

    Department (String name,Faculty [] facultyMembers )
    {
        this.name = name;
        this.facultyMembers = facultyMembers;
        System.out.println("Constructor : Department " + name + "created.");
    }

    public Faculty[] getFacultyMembers() {
        return facultyMembers;
    }
}

public class Main{
    public static void main(String [] args)

    {

        System.out.println("Main method: Program started.");

        Faculty F1 = new Faculty("Alice");


        Faculty F2 = new Faculty("Bob");


        Faculty F3 = new Faculty("Charlie");

        Faculty[] faculty = {F1,F2,F3};

        Department csDepartment = new Department("Computer Science", faculty);

        System.out.println("Main method: Program started.");
    }

}