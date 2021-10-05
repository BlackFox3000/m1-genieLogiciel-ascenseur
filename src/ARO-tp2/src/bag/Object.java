package bag;

public class Object {
    private int weight;
    private int value;

    public Object(int poid, int valeur){
        this.weight = poid;
        this.value = valeur;
    }

    public int getCapacity() {
        return weight;
    }

    public int getValue() {
        return value;
    }
}
