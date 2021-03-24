public class Dog extends Animal{

    private int eys;
    private int legs;
    private int tale;
    private int teeth;
    private String coat;

    public Dog(String name,   int size, int weight,int eys, int legs, int tale, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eys = eys;
        this.legs = legs;
        this.tale = tale;
        this. teeth = teeth;
        this.coat = coat;
    }
    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(3);
        super.move(speed);
    }
}
