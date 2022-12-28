public class Calculation implements Runnable {
    private double radius;
    private double side;
    private double area;
    private double phi = 3.14;

    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getSide() {
        return side;
    }
    
    public void setSide(double side) throws IllegalArgumentException {
        if (side < 1) {
            throw new IllegalArgumentException("Error");
        }
        this.side = side;
    }
    
    public double getArea() {
        return area;
    }
    
    public void setCircle() throws IllegalArgumentException{
        if (this.radius < 1) {
            throw new IllegalArgumentException("Error");
        }
        this.area = this.phi * this.radius * this.radius;
    }
    
    public void setSquare() throws IllegalArgumentException{
        if (this.side < 1){
            throw new IllegalArgumentException("Error");
        }
        this.area = this.side * this.side;
    }
    
    public void setTrapezoid(double a, double b, double t) throws IllegalArgumentException {
        if (a < 1 || b < 1 || t < 1) {
            throw new IllegalArgumentException("Error");
        }
        this.area = (a + b) * t / 2;
    }
    
    public double getCircle() {
        return this.area;
    }
    
    public double getSquare() {
        return this.area;
    }
    
    public double getTrapezoid(double a, double b, double t) {
        return this.area;
    }
    
    @Override
    public void run() {
    System.out.println("\n====Program will start in====");
        for (int i = 3; i >= 1; i--) { 
            System.out.println("Starting with thread " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();;
            }
        }
    }
}