import java.util.Arrays;

/**
 * @author Sanaa Khan
 * @created 04/10/2022
 */

public class CatMouseDog {

    public String isCaught(String x, int j) {
        String message = null;
        boolean validInput = false;

        char[] ch = x.toCharArray();

        /**
         * Checking any invalid characters in the input string.
         */
        validInput = this.ValidateString(ch);
        if(!validInput)
            return "Invalid Input";

        /**
         * Initializing Animals object with positions and counts
         */
        Animals animals = new Animals(ch);

        /**
         * Checking animal count validity
         */
        if (animals.getCatCount() > 1 || animals.getMouseCount() > 1 || animals.getDogCount() > 1)
            return "Too many animals!";
        else if(animals.getCatCount() == 0 && (animals.getMouseCount() > 0 || animals.getDogCount() > 0))
            return "No cat to run away from!";
        else if(animals.getMouseCount() == 0 && (animals.getCatCount() > 0  || animals.getDogCount() > 0))
            return "No mouse to chase!";

        if (animals.getCatCount() == 0 && animals.getMouseCount() == 0 && animals.getDogCount() == 0)
            return "Boring without all three";

        /**
         * Checking if the cat can catch the mouse.
         */
         return this.CheckIfCatCatchesMouse(animals, j);
    }

    public String CheckIfCatCatchesMouse(Animals animal, int j)
    {
        if (Math.min(animal.getCatPosition(), animal.getMousePosition()) < animal.getDogPosition() && Math.max(animal.getCatPosition(),animal.getMousePosition()) > animal.getDogPosition())
            return "Protected";
        if(Math.abs(animal.getCatPosition() - animal.getMousePosition()) <= j)
           return "Caught";
        else
            return "Escaped";
    }

    public static boolean ValidateEachCharacter(char c){
        boolean validInput = false;
        for (ExpectedInputChar characters : ExpectedInputChar.values()) {
            if (characters.value == c) {
                validInput = true;
            }
        }
        return validInput;
    }

    public boolean ValidateString(char[] ch){

        for (char character : ch) {
            boolean validChar = this.ValidateEachCharacter(character);
            if(!validChar)
                return false;
        }
        return true;
    }

}
