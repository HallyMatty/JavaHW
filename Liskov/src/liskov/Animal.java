package liskov;

class Animal {
    protected String name;
    
    public Animal(String name) {
        setName(name);
    }
    
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("name can't be empty");
        }
        this.name = name;
    }
    
    public String getName() { return name; }
    
    public String move() {
        return "moves";
    }
}