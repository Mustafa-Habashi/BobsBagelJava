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

}
