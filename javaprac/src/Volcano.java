public class Volcano {
    private String name;
    private String activityLevel;

    // Constructor
    public Volcano(String name, String activityLevel) {
        this.name = name;
        this.activityLevel = activityLevel;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for activity level
    public String getActivityLevel() {
        return activityLevel;
    }

    // Setter for activity level
    public void setActivityLevel(String activityLevel) {
        this.activityLevel = activityLevel;
    }

    // Method to display volcano information
    public void displayInfo() {
        System.out.println("Volcano Name: " + name);
        System.out.println("Activity Level: " + activityLevel);
    }

    // Override finalize method to display a message when the object is garbage collected
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Volcano object " + name + " is being garbage collected.");
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) {
        // Creating and referencing Volcano objects
        Volcano volcano1 = new Volcano("Mount Fuji", "Active");
        Volcano volcano2 = new Volcano("Mount Vesuvius", "Dormant");

        // Displaying volcano information
        volcano1.displayInfo();
        volcano2.displayInfo();

        // Dereferencing Volcano objects
        volcano1 = null;
        volcano2 = null;

        // Requesting garbage collection
        System.gc();

        // Creating more Volcano objects to demonstrate dynamic creation
        for (int i = 0; i < 5; i++) {
            Volcano volcano = new Volcano("Volcano " + i, "Unknown");
            volcano.displayInfo();
        }

        // Dereferencing the newly created Volcano objects
        for (int i = 0; i < 5; i++) {
            Volcano volcano = new Volcano("Volcano " + i, "Unknown");
            volcano = null;
        }

        // Requesting garbage collection again
        System.gc();
}
}