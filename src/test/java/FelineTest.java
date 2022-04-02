import com.example.Feline;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelineTest {
    @Test
    public void eatMeatIsMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }

    @Test
    public void FamilyIsFeline() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void getOneKitten() {
        Feline feline = new Feline();
        int expected = 1;
        assertEquals(expected, feline.getKittens());
    }

    @Test
    public void getMultipleKittens() {
        Feline feline = new Feline();
        int expected = 5;
        assertEquals(expected, feline.getKittens(5));
    }
}
