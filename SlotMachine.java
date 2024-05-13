public class SlotMachine {
    private int numOfReels;
    private int selectionsPerReel;
    private int costPerReel;

    public SlotMachine(int numOfReels, int selectionsPerReel, int costPerReel) {
        this.numOfReels = numOfReels;
        this.selectionsPerReel = selectionsPerReel;
        this.costPerReel = costPerReel;
        System.out.println(toString());

    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("Welcome to Skibidi Slot Mania!\n");
        result.append("Number of Reels: " + this.numOfReels);
        result.append("Selections per reel: " + this.selectionsPerReel);
        result.append("Cost per pay line " + this.costPerReel * this.numOfReels);
        result.append("");
        result.append("");


        return result.toString();
    }

    public static void main(String[] args) {

    }
}
