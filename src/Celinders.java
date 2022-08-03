import java.util.ArrayList;
import java.util.List;

public class Celinders {

    private ArrayList<Celinder> list;

    public Celinders(){
        this.list = new ArrayList<>();
    }



    public double getAvarageVolume(){
        double area = 0;
        for(int i=0; i < list.size(); i ++){
            area += list.get(i).getVolume();
        }
        return area/list.size();
    }



    public void add(Celinder value) {
        list.add(value);
    }




    public void remove(Celinder celinder) {
        list.remove(celinder);
    }


    public void remove(int index) {
        if(index < list.size()){
            list.remove(index);
        }
    }

    public int countOf(String type) {

        return getListOf(type).size();

    }


    public Celinders getListOf(String type) {
        Celinders result = new Celinders();

        for (Celinder item : list) {
            if (item.getClass().getSimpleName().equalsIgnoreCase(type))
                result.add(item);
        }

        return result;
    }


    public int size() {
        return this.list.size();
    }
    public String toString() {
        return "List if Cylinders{" + list + '}';
    }
}
