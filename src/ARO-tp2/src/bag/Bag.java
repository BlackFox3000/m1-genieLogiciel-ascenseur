package bag;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Bag {
    private static int capacity =0;
    private int value = 0;
    private static ArrayList<Object> objects = new ArrayList<>();
    private static String path;

    public Bag() {}

    public static void main(String[] args) {
        String file = path;
        try(BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;

            while ((line = br.readLine()) != null) {
                if(capacity ==0)
                    capacity = Integer.parseInt(line);
                else {
                    System.out.println(line);
                    String[] splitObject = line.split(" ");
                    objects.add(new Object(Integer.parseInt(splitObject[0]), Integer.parseInt(splitObject[1])));
                }
               //[Débug] System.out.println(line);
                ;
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("capacité:"+ capacity);
    }

    public Bag(String string){
        path = string;
    }

    public ArrayList<Object> getAll(){
        return objects;
    }

    public Object get(int i){
        return objects.get(i);
    }

    public int capcity() {
        return capacity;
    }

    public int syze() {
        return objects.size();
    }

    public void build(){
        String file = path;
        try(BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;

            while ((line = br.readLine()) != null) {
                if(capacity ==0)
                    capacity = Integer.parseInt(line);
                else {
                    System.out.println(line);
                    String[] splitObject = line.split(" ");
                    objects.add(new Object(Integer.parseInt(splitObject[0]), Integer.parseInt(splitObject[1])));
                    value += Integer.parseInt(splitObject[1]);
                }
                //[Débug] System.out.println(line);
                ;
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("capacité:"+ capacity);
    }

    public void add(Object object) {
        capacity += object.getCapacity();
        value += object.getValue();
    }

    public int getValue() {
        return value;
    }
}
