package liskov;

class Fish extends Animal {
    private double length;
    
    public Fish(String name, double length) {
        super(name);
        setLength(length);
    }
    
    public void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("length can't be nonpositive");
        }
        this.length = length;
    }
    
    public double getLength() { return length; }
    
    @Override
    public String move() {
        return "swims";
    }
}