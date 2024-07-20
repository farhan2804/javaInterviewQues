//it is known as compile time polymorphism or overloading because 
//which method to be executed decided at the time of compilation
//decision is made by the compiler itself
//based on method signature(number and type of argument)
//its called static or early binding because
//the binding of method and method calls done at the time of compilation
//and it wont changes
class compileTimePoly {
    // method with two parameters

    public int add(int a, int b) {
        return a + b;
    }
    // method with three parameters

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String args[]) {
        compileTimePoly operation = new compileTimePoly();

        System.out.println(operation.add(5.2, 12.2));
        System.out.println(operation.add(4, 6, 7));
        System.out.println(operation.add(9, 8));
    }

}
