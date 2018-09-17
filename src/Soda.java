public class Soda {

    //Instance fields
    private int[] sodaArray = new int[4];

    /**
     * refill method - takes in number of sodas for each index, and sets each index to that many sodas.
     * @param sodaCount
     */
    public void sodaRefill(int sodaCount) {
        for(int i = 0; i < 4; i++) {
            sodaArray[i] = sodaCount;
        }
    }

    /**
     * interactions of user with the vending machine (in terms of sodas).
     * @param index index of which soda the user wants
     * @return statement describing the soda for the user
     */
    public String getSoda(int index) {
        if(sodaArray[index] != 0) {
            sodaArray[index]--;
            if(index == 0) {
                return "You have received one Coke.";
            }
            if(index == 1) {
                return "You have received one Orange.";
            }
            if(index == 2) {
                return "You have received one Diet Coke.";
            }
            if(index == 3) {
                return "You have received one Sprite.";
            }
        }
        if(sodaArray[index] == 0 && index == 0) {
            return "There are no more Cokes left please refill.";
        }
        if(sodaArray[index] == 0 && index == 1) {
            return "There are no more Oranges left please refill.";
        }
        if(sodaArray[index] == 0 && index == 2) {
            return "There are no more Diet Cokes left please refill.";
        }
        if(sodaArray[index] == 0 && index == 3) {
            return "There are no more Sprites left please refill.";
        }
        else return "Invalid statement please try again";
    }
}