package Main;

import Model.*;


public class Main {
    public static void main(String[] args) {

        try {
            Predator wolf = new Predator(1, "Ivan", 0); //волк
            Predator fox = new Predator(2, "Alisa", 30);   //лиса

            Herbivore deer = new Herbivore(3, "Pavel", 90); //олень
            Herbivore hare = new Herbivore(4, "Dima", 15); //заяц

            Herb clover = new Herb(5, "Klever", 300); //клевер
            Herb currant = new Herb(6, "Yagoda", 500); //смородина


            wolf.eat(deer); //волк съедает оленя
            System.out.println("info: " + wolf.getInfo()); //выводим информацию в консоль

            wolf.eat(hare); //волк съедает зайца
            System.out.println("info: " + wolf.getInfo()); //выводим информацию в консоль

            deer.eat(clover);//олень съедает клевер
            System.out.println("info: " + deer.getInfo());//выводим информацию в консоль

            hare.eat(currant);//заяц съедает смородину
            System.out.println("info: " + hare.getInfo());//выводим информацию в консоль

            wolf.eat(fox); //волк съедает
            System.out.println("info: " + wolf.getInfo());//выводим информацию в консоль

        } catch (IllegalStateException e) {
            e.printStackTrace();           //ЗАДАТЬ ВОПРОС!!!!!
        }
        catch (IllegalArgumentException e) {
            e.printStackTrace();           //ЗАДАТЬ ВОПРОС!!!!
        }
    }
}