import com.example.Feline;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {
    @Test
    public void eatMeatIsMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals("Кошачьи питаются - \"Животные\", \"Птицы\", \"Рыба\"", expected, actual);
    }

    @Test
    public void FamilyIsFeline() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals("Семейство Кошачьи", expected, actual);
    }

    @Test
    public void getOneKitten() {
        Feline feline = new Feline();
        int expected = 1;
        assertEquals("Завести одного котёнка", expected, feline.getKittens());
    }

    @Test
    public void getMultipleKittens() {
        Feline feline = new Feline();
        int expected = 5;
        assertEquals("Завести N котят", expected, feline.getKittens(5));
    }
}
