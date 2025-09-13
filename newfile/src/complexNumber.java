class ComplexNumber
{
    double real, imaginary;

    // Constructor
    ComplexNumber(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two Complex numbers
    ComplexNumber add(ComplexNumber other)
    {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    void display()
    {
        System.out.println(real + " + " + imaginary + "i");
    }
}

class Test
{
    public static void main(String[] args)
    {
        ComplexNumber c1 = new ComplexNumber(2.3, 4.5);
        ComplexNumber c2 = new ComplexNumber(1.6, 3.7);
        ComplexNumber sum = c1.add(c2);
        System.out.print("Sum of c1 and c2: ");
        sum.display();  // Outputs the sum of the two complex numbers
    }
}
