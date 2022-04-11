/**
 * @author Sanaa Khan
 * @created 04/10/2022
 */

public enum ExpectedInputChar {
    CAT('C'),
    MOUSE('m'),
    DOG('D'),
    PERIOD('.');

    public final char value;


    ExpectedInputChar(char value) {

        this.value = value;
    }

    /**
     * Returns the character value.
     */
    public char getValue() {

        return value;
    }
}
