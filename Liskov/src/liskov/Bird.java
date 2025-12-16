package liskov;

class Bird extends Animal {
    private boolean canFly;
    
    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }
    
    public boolean canFly() { return canFly; }
    
    @Override
    public String move() {
        return canFly ? "flies" : "walks";
    }
}