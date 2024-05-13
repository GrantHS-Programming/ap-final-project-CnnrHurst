public class Roulette {
    private int bankRoll;
    private int spinCount;

    public Roulette(int bankRoll){
        this.bankRoll = bankRoll;
        this.spinCount = 0;
    }

    public void turn(int bet, String selectedNumber) {
        //give winnings if selected number is the winning number
        int betWinnings = bet * 36;
        if (this.bankRoll >= bet){
            this.bankRoll -= bet;
            int spinNumber = spin();
            System.out.println(toString());
            if ((spinNumber == Integer.parseInt(selectedNumber)) || (spinNumber == 37 && Integer.parseInt(selectedNumber) == 00)){
                System.out.println("You picked the winning number " + spinNumber + " and win $" + betWinnings);
                this.bankRoll += betWinnings;
            }
            else {
                System.out.println("You did not pick the winning number.");
            }
        }
        else {
            System.out.println("!!!!!! Insufficient balance. !!!!!");
        }
    }

    private int spin(){
        // 0 -36 will be the actual values that are returned
        //37 will be translated to 00
        this.spinCount++;
        return (int) Math.floor(Math.random()*100)%38;
    }

    public String toString(){
        return ("\nRoulette Game:\n" +
                "Bank Roll = $" + this.bankRoll + "\n"+
                "Spin Count: " + this.spinCount);
    }

    public static void main(String[] args) {
        //make auto generated method stub
        Roulette rg1 = new Roulette(10);
        rg1.turn(1,"10");
        rg1.turn(2,"20");
    }
}
