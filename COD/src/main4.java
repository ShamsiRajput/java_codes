interface main4 {
    abstract void displayShapes();
}

class A {
    protected String shape;

    A(String shape) {
        this.shape = shape;
    }

    void displayShapes() {
        System.out.println("Shape is printed");
    }
}

class B extends A implements main4 {

    B(String shape) {
        super(shape);
    }

    @Override
    public void displayShapes() {

    }
}
