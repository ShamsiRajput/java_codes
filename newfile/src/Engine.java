// Engine class
/*class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
    // Car class
    class Car {
        private String model;
        private Engine engine; // Composition: Car has an Engine

        public Car(String model, String engineType) {
            this.model = model;
            this.engine = new Engine(engineType); // Engine is created with the Car
        }

        public String getModel() {
            return model;
        }

        public Engine getEngine() {
            return engine; // Return the Engine object
        }

        public void displayInfo() {
            System.out.println("Car Model: " + model);
            System.out.println("Engine Type: " + engine.getType());

    }

        // Main class to demonstrate composition
        public static void main(String[] args) {
            Car car = new Car("Toyota Camry", "V6");

            car.displayInfo();

            // Access the engine type from the car
            System.out.println("Engine Type from Car: " + car.getEngine().getType());
        }
    }
*/