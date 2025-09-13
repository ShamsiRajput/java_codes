public class Doctor extends Employee {
    private String specialization;

    @Override
    public void login()
    {
        System.out.println("Doctor logged in.");
    }
}
