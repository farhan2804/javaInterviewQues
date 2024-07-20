//class,object constructor example
class car {

    // properties(or variables)
    String brand;
    String color;

    // constructor
    car() {
        brand = "audi";
        color = "black";
    }

    // method(or behaviour)
    void displayResult() {
        System.out.println("brand is:" + brand + " "
                + "color is:" + color);
    }

    
    public static void main(String args[]) {
        //object is created
        car mycar = new car();
        mycar.displayResult();
    }

}
