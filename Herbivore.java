package Model;
import Exception.*;

public class Herbivore extends Animal {

    public Herbivore(int id, String name,  float m) {

        super(id, name,  m);
    }



    public void eat(Food food) {
        if (!(isAlive()))  //проверяем живо ли травоядное
            throw new IllegalDieAnimalException();
        if (!(food instanceof Herb))
            throw new IllegalFoodNotHerbExeption();
        m += ((Herb) food).getM();
        ((Herb) food).setM(0);


    }
}