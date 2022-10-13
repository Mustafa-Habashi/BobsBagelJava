import java.util.ArrayList;

public class Basket {
        static ArrayList<String> items = new ArrayList<String>(5);
        static int basketCapacity = 5;



    public static String add(String item){
        items.add(item);
        return items.get(0);

    }


    public static void remove(String item){
        items.remove(item);

    }


    public static int changeBasketSize(int number){
     return basketCapacity += number;

    }




}
