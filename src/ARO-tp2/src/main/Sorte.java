package main;

import bag.Bag;
import bag.Object;

public class Sorte {

    public Bag glouton(Bag bag){
        int capacity= 0;
        Bag result = new Bag();
        System.out.println("bag size:"+bag.syze());
        for ( Object object:bag.getAll()) {
            System.out.println("bag capacity:"+bag.capcity()+" : object capacity "+object.getCapacity()+" : total capacity "+capacity);
            if(bag.capcity()>=capacity+object.getCapacity()) {
                result.add(object);
                capacity += object.getCapacity();
            }
        }
        return result;
    }



}
