import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Human hm1 = new Human();
        hm1.name = "Rostislav";
        hm1.date = "24.08.1400 - 30.04.1480";
        hm1.gender = "male";
        hm1.father = "Uunknown";
        hm1.children = new ArrayList<Human>();


        Human hm2 = new Human();
        hm2.name = "Jaroslav";
        hm2.date = "24.08.1425 - 30.04.1520";
        hm2.gender = "male";
        hm2.father = hm1.name;
        hm2.children = new ArrayList<Human>();

        Human hm3 = new Human();
        hm3.name = "Izislav";
        hm3.date = "14.03.1490 - 09.04.1548";
        hm3.gender = "male";
        hm3.father = hm2.name;


        hm1.children.add(hm2);
        hm1.children.add(hm3);





        FamalyTree famaly = new FamalyTree();
        famaly.humlist = new ArrayList<Human>();
        famaly.humlist.add(hm1);
        famaly.humlist.add(hm2);
        famaly.humlist.add(hm3);

//        famaly.printFamalyTree();









    }


}
