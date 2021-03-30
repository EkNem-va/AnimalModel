package Model;
import Exception.*;

public abstract class Animal extends Food {
    protected int id;
    protected String name;
    protected boolean isAlive;
    protected float m;

    public Animal(int id, String name, float m) {
        this.id = id;
        this.name = name;
        this.m = m;
        if (m <= 0){
            throw new IllegalMassaExceptionMassa();
        }
        isAlive = true;
    }

    public String getInfo(){
        return "id = " + id + "name" + name + "m" + m + "isAlive"+isAlive;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public float getM() {
        return m;
    }

    public void setM(float m) {
        this.m = m;
    }

    public void die() {

        if (!isAlive)
            throw new IllegalDieAnimalException();
        isAlive = false;
    }

    public  abstract void eat(Food food);

}