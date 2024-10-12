class Complex {

    public double real, imag; 

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public void SetReal(double setReal) {
        this.real = setReal;
    }

    public void GetReal() {
        System.out.println("Real value is: " + this.real);
    }

    public void SetImag(double setImag) {
        this.imag = setImag;
    }

    public void GetImag() {
        System.out.println("Imaginary value is: " + this.imag);
    }

    public Complex Mul(Complex num) {
        double newReal = (this.real*num.real) - (this.imag*num.imag);
        double newImag = (this.real*num.imag + this.imag*num.real);
        return new Complex(newReal, newImag);
    }

    public Complex Add(Complex num) {
        double newReal = this.real + num.real;
        double newImag = this.imag + num.imag;
        return new Complex(newReal, newImag);
    }

    // override toString() for intuitive complex number display
    @Override
    public String toString() {
        return this.real + " + " + this.imag + "i";
    }

    public static void main(String[] args) {
        // create two complex numbers to test
        Complex c1 = new Complex(2.5, 1.2);
        Complex c2 = new Complex(2.4, 1.1);

        // test addition
        Complex c3 = c1.Add(c2);
        System.out.println("Addition Result: " + c3);

        Complex c4 = new Complex(2.5, 1.2);

        Complex c5 = new Complex(2.4, 1.1);

        // test multiplication
        Complex c6 = c4.Mul(c5);
        System.out.println("Multiplication Result: " + c6);    
    }
}
