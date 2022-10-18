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
    public static boolean isBasketFull(){
        if(items.size()>basketCapacity){
            return true;
        }else{
            return false;
        }
    }
    public static String isItemExist(String item){
        if(items.contains(item) == false){
           return "Item is not there to remove" ;
        }
        return "Item Exist";
    }
    public static String isDuplicateItem(String item){
        if(items.contains(item) == true){
            return "Item Exist";
        }
        items.add(item);
        return "Item is added to the Basket";
    }
    public static int bagelPrice(Bagel item){
        return item.getPrice();
    }
    public static int bagelTotalPrice (Bagel ...item) {
        int totalPrice = 0;
        for(Bagel b : item){
            totalPrice += b.getPrice();
        }
        return totalPrice;
    }
}

