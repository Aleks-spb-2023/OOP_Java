import java.util.ArrayList;
import java.util.List;

public class Human {
    String name;
    String date;
    String gender;
    String father;
    List<Human> children;

    public void addchildren(Human a){
        children.add(a);

    }

    public void getchildren(Human c){
        System.out.println(c.children);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender='" + gender + '}';


    }

}
