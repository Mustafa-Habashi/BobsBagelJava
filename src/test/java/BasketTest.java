import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasketTest {
    @Test
    @DisplayName("Add item to Array")
    void add(){
        //Arrange
        String item1 = "Bagel";
        //Act
        String result = Basket.add(item1);
        //Assert
        assertEquals(result, item1);

    }

    //clean up
    @AfterEach
    public void cleanBasket(){
        Basket.items.clear();
    }
    @Test
    @DisplayName("Test length of Array when item is added")
    void checkSizeOfBasket(){
        String item1 = "Bagel";
        //Act
         Basket.add(item1);
         int result = Basket.items.size();
        //Assert
        assertEquals(result, 1);

    }
    @Test
    @DisplayName("Test length of Array when item is removed")
    void remove(){
        String item1 = "Bagel";
        //Act
        Basket.remove(item1);
        int result = Basket.items.size();
        //Assert
        assertEquals(result, 0);
    }
    @Test
    @DisplayName("Changing Basket Size Capacity")
    void changeBasketSize(){

        int number = 2;
        //Act
        Basket.changeBasketSize(number);
        int result = Basket.basketCapacity;
        //Assert
        assertEquals(result, 7);

    }
    @Test
    @DisplayName("Is Basket Full")

    void isBasketFull(){
        //Arrange
        String item1 = "Bagel1";
        String item2 = "Bagel2";
        String item3 = "Bagel3";
        String item4 = "Bagel4";
        String item5 = "Bagel5";
        String item6 = "Bagel6";
        //Act
        Basket.add(item1);
        Basket.add(item2);
        Basket.add(item3);
        Basket.add(item4);
        Basket.add(item5);
        Basket.add(item6);
        boolean result = Basket.isBasketFull();
        //Assert
        assertEquals(result, true);
    }
    @Test
    @DisplayName("Trying to remove non existing Item")
    void isItemExist(){
        //Arrange
        String item1 = "Bagel1";
        String item2 = "Bagel2";
        String item3 = "Bagel3";
        String item4 = "Bagel4";
        //Act
        Basket.add(item1);
        Basket.add(item2);
        Basket.add(item3);
        Basket.remove(item4);
        String result =Basket.isItemExist(item4);
        //Assert
        assertEquals(result, "Item is not there to remove");
    }
    @Test
    @DisplayName("Trying to add Duplicate Items")
    void isDuplicateItem() {
        //Arrange
        String item1 = "Bagel1";
        String item2 = "Bagel2";
        String item3 = "Bagel3";
        //Act
        Basket.add(item1);
        Basket.add(item2);
        Basket.add(item3);
        Basket.add(item3);
        String result = Basket.isDuplicateItem(item3);
        //Assert
        assertEquals(result, "Item Exist");
    }
    @Test
    @DisplayName("Checking the price for each Bagel")
    void bagelPrice() {
        //Arrange
        Bagel item1 = new Bagel("Bagel1",5);
        //Act
        int result = Basket.bagelPrice(item1);
        //Assert
        assertEquals(result, 5);
    }
    @Test
    @DisplayName("Checking the total price of Bagels")
    void bagelTotalPrice() {
        //Arrange
        Bagel item1 = new Bagel("Bagel1",5);
        Bagel item2 = new Bagel("Bagel2",5);
        Bagel item3 = new Bagel("Bagel3",5);

        //Act
        int result = Basket.bagelTotalPrice(item1);
        //Assert
        assertEquals(result, 15);
    }
}
