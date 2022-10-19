import java.util.ArrayList;

public class Basket {
        ArrayList<String> items = new ArrayList<String>(5);
         private int basketCapacity = 5;
    public String add(String item){
        items.add(item);
        return items.get(0);
    }
    public void remove(String item){
        items.remove(item);

    }

    public int changeBasketSize(int number){
     return basketCapacity += number;
    }
    public boolean isBasketFull(){
        if(items.size()>basketCapacity){
            return true;
        }else{
            return false;
        }
    }
    public String isItemExist(String item){
        if(items.contains(item) == false){
           return "Item is not there to remove" ;
        }
        return "Item Exist";
    }
    public String isDuplicateItem(String item){
        if(items.contains(item)){
            return "Item Exist";
        }
        items.add(item);
        return "Item is added to the Basket";
    }
    public int bagelPrice(Bagel item){
        return item.getPrice();
    }
    public int bagelTotalPrice (Bagel ...item) {
        int totalPrice = 0;
        for(Bagel b : item){
            totalPrice += b.getPrice();
        }
        return totalPrice;
    }
}

