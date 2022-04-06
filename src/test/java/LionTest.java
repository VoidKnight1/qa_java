import com.example.Lion;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class LionTest {
    @Test
    public void getOneKitten() throws Exception {
        Lion lion = new Lion("Самец");
        int expected = 1;
        assertEquals("Добавление одного \"котёнка\"", expected, lion.getKittens());
    }

    @Test
    public void getMultipleKittens() throws Exception {
        Lion lion = new Lion("Самка");
        int expected = 5;
        assertEquals("Добавление нескольких \"котят\"", expected, lion.getKittens(5));
    }

    @Test
    public void doesHaveManeWithMale() throws Exception {
        Lion lion = new Lion("Самец");
        assertTrue("Пол зверя \"Самец\"", lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeWithFemale() throws Exception {
        Lion lion = new Lion("Самка");
        assertFalse("Пол зверя НЕ \"Самец\"", lion.doesHaveMane());
    }

    @Test
    public void getFoodAsCarnivoreIsMeat() throws Exception {
        Lion lion = new Lion("Самец");
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood("Хищник");
        assertEquals("Лев питается - \"Животные\", \"Птицы\", \"Рыба\"", expected, actual);
    }

    @Test
    public void getFoodIsMeat() throws Exception {
        Lion lion = new Lion("Самка");
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        assertEquals("Лев питается - \"Животные\", \"Птицы\", \"Рыба\"", expected, actual);
    }
}
