import java.util.ArrayList;

public class animal {
    public void eat(){
        System.out.println("this animal is eating");
    }

    public static void main(String[] args)
    {
        ArrayList<animal> an =  new ArrayList<>();
        an.add(new animal());
        an.add(new chat());
        an.add(new dog());

        for(animal a:an)
        {
            a.eat();
        }
    }
}
