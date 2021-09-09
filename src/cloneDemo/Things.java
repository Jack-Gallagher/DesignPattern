package cloneDemo;

import java.util.ArrayList;

public class Things implements Cloneable{
    private ArrayList<String> array = new ArrayList<>();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Things things = null;
        try {
            things = (Things) super.clone();
            //deepcopy
            this.array = (ArrayList<String>) this.array.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return things;
    }

    public ArrayList<String> getArray() {
        return array;
    }

    public void setArray(String value) {
        this.array.add(value);
    }
}
