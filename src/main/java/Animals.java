/**
 * @author Sanaa Khan
 * @created 04/10/2022
 */

public class Animals {

    private int catPosition;
    private int catCount;

    private int mousePosition;
    private int mouseCount;

    private int dogPosition;
    private int dogCount;

    public Animals(char[] ch){
        //Animals animals = new Animals();
        for (int i = 0; i < ch.length; i++) {
            int catCount = 0;
            int dogCount = 0;
            int mouseCount = 0;
            if (ch[i] == ExpectedInputChar.CAT.getValue()) {
                this.setCatPosition(i);
                this.setCatCount(++catCount);
            }
            if (ch[i] == ExpectedInputChar.DOG.getValue()) {
                this.setDogPosition(i);
                this.setDogCount(++dogCount);
            }
            if (ch[i] == ExpectedInputChar.MOUSE.getValue()) {
                this.setMousePosition(i);
                this.setMouseCount(++mouseCount);
            }
        }
    }

    /**
     * Returns the cat position.
     */
    public int getCatPosition() {
        return this.catPosition;
    }

    /**
     * Returns the number of times cat appears in the string.
     */
    public int getCatCount() {
        return this.catCount;
    }

    /**
     * Returns the mouse position.
     */
    public int getMousePosition() {
        return this.mousePosition;
    }

    /**
     * Returns the number of times mouse appears in the string.
     */
    public int getMouseCount() {
        return this.mouseCount;
    }

    /**
     * Returns the dog position.
     */
    public int getDogPosition() {
        return this.dogPosition;
    }

    /**
     * Returns the number of times dog appears in the string.
     */
    public int getDogCount() {
        return this.dogCount;
    }

    /**
     * Sets the cat's position.
     */
    public void setCatPosition(final int position) {
        this.catPosition = position;
    }

    /**
     * Sets the number of times cat appears in the string.
     */
    public void setCatCount(final int count) { this.catCount = count;}

    /**
     * Sets the mouse's position.
     */
    public void setMousePosition(final int position) {
        this.mousePosition = position;
    }

    /**
     * Sets the number of times mouse appears in the string.
     */
    public void setMouseCount(final int count) { this.mouseCount = count;}

    /**
     * Sets the dog's position.
     */
    public void setDogPosition(final int position) {
        this.dogPosition = position;
    }

    /**
     * Sets the number of times dog appears in the string.
     */
    public void setDogCount(final int count) { this.dogCount = count;}
}
