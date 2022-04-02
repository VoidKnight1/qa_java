import com.example.Lion;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LionTest {
    @Test
    public void getOneKitten() throws Exception {
        Lion lion = new Lion("Самец");
        int expected = 1;
        assertEquals(expected, lion.getKittens());
    }

    @Test
    public void getMultipleKittens() throws Exception {
        Lion lion = new Lion("Самка");
        int expected = 5;
        assertEquals(expected, lion.getKittens(5));
    }

    @Test
    public void doesHaveManeWithMale() throws Exception {
        Lion lion = new Lion("Самец");
        boolean expected = true;
        assertEquals(expected, lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeWithFemale() throws Exception {
        Lion lion = new Lion("Самка");
        boolean expected = false;
        assertEquals(expected, lion.doesHaveMane());
    }

    @Test
    public void getFoodAsCarnivoreIsMeat() throws Exception {
        Lion lion = new Lion("Самец");
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood("Хищник");
        assertEquals(expected, actual);
    }

    @Test
    public void getFoodIsMeat() throws Exception {
        Lion lion = new Lion("Самка");
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
    }
}
