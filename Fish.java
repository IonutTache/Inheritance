public class Fish extends Animal {

    private int gills;
    private int eys;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eys, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eys = eys;
        this.fins = fins;
    }

    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackfin(){

    }

    private void swim(int speed){
       moveMuscles();
       moveBackfin();
       super.move(speed);
    }
}
