import java.util.ArrayList;

public class FamalyTree {
    ArrayList<Human> humlist;


    public void addhuman(Human hm){
        humlist.add(hm);

    }
    public void printFamalyTree(){
        System.out.println(humlist);
    }

}
