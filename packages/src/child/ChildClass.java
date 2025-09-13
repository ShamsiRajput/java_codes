package child;


import vehicles.ParentClass;

public class ChildClass extends ParentClass {
    public void showAccess() {
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        // System.out.println("Default: " + defaultVar); // Error
        // System.out.println("Private: " + privateVar); // Error
    }
}
