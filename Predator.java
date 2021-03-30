package Model;
import Exception.*;

//наследование хищники
public class Predator extends Animal {


    //конструктор для класса хищников
    public Predator(int id, String name, float m) {
        super(id, name, m);


    }

    public void eat(Food food) {
        if (!isAlive())          //проверяем живо ли животное
            throw new IllegalDieAnimalException();

        if (!(food instanceof Animal))  //проверяем принадлежит ли еда к классу Животные
            throw new IllegalFoodNotAnimalException();

        if (!(((Animal) food).isAlive()))    //проверяем жива ли жертва
            throw new IllegalFoodDieExeption();
        ((Animal) food).die();
        m += ((Animal) food).getM();
        ((Animal) food).setM(0);
    }

}