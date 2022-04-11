import org.junit.Assert;
import org.junit.Test;

public class CatMouseDogTest {
    String INPUT_1 = "..C...D.....m.";
    String INPUT_2 = ".....C............m......";
    String INPUT_3 = "...m.........C...D";
    String INPUT_4 = "...m....D....C....X...";
    String INPUT_5 = "..................";
    String INPUT_6 = "....C..............";

    int JUMPSTEPS_1 = 5;
    int JUMPSTEPS_2 = 10;
    int JUMPSTEPS_3 = 15;

    @Test
    public void testCaught() {
        // Parameters
        String x = INPUT_2;
        int j = JUMPSTEPS_3;

        CatMouseDog catMouseRace = new CatMouseDog();
        String message = catMouseRace.isCaught(x, j);
        String expectedMessage = "Caught";

        Assert.assertEquals(expectedMessage, message);
    }

    @Test
    public void testEscaped() {
        // Parameters
        String x = INPUT_3;
        int j = JUMPSTEPS_1;

        CatMouseDog catMouseRace = new CatMouseDog();
        String message = catMouseRace.isCaught(x, j);
        String expectedMessage = "Escaped";

        Assert.assertEquals(expectedMessage, message);
    }

    @Test
    public void testProtected() {
        // Parameters
        String x = INPUT_1;
        int j = JUMPSTEPS_2;

        CatMouseDog catMouseRace = new CatMouseDog();
        String message = catMouseRace.isCaught(x, j);
        String expectedMessage = "Protected";

        Assert.assertEquals(expectedMessage, message);
    }

    @Test
    public void testInvalid() {
        // Parameters
        String x = INPUT_4;
        int j = JUMPSTEPS_2;

        CatMouseDog catMouseRace = new CatMouseDog();
        String message = catMouseRace.isCaught(x, j);
        String expectedMessage = "Invalid Input";

        Assert.assertEquals(expectedMessage, message);
    }

    @Test
    public void testBoring() {
        // Parameters
        String x = INPUT_5;
        int j = JUMPSTEPS_2;

        CatMouseDog catMouseRace = new CatMouseDog();
        String message = catMouseRace.isCaught(x, j);
        String expectedMessage = "Boring without all three";

        Assert.assertEquals(expectedMessage, message);
    }

    @Test
    public void testMissingMouse() {
        // Parameters
        String x = INPUT_6;
        int j = JUMPSTEPS_2;

        CatMouseDog catMouseRace = new CatMouseDog();
        String message = catMouseRace.isCaught(x, j);
        String expectedMessage = "No mouse to chase!";

        Assert.assertEquals(expectedMessage, message);
    }
}
