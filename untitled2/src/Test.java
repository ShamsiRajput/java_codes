public class Test {
    public static void main(String []args)
    {
        Employee employee = new Employee();
        Doctor doctor = new Doctor();
        Surgeon surgeon = new Surgeon();
      employee = doctor;
      employee.login();
      employee = surgeon;
      employee.login();
      if (employee instanceof Surgeon )
      {
          Surgeon s = (Surgeon)employee ;
          ;
      }

    }
}
